package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        //adding sme books to library
        Library library = new Library("Great Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n->library.getBooks().
                        add(new Book("SomeBook"+n, "SomeAuthor"+n, LocalDate.of(2017, Month.MAY, 14+n))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("University Of Warsaw Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object Library
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Warsaw University Of Technology Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepCloneLibrary.getBooks().size());
    }
}

package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Sienkiewicz", "Rodzina Polanieckich", 1978, "Yes"));
        books.add(new Book("Sienkiewicz", "Krzyzacy", 1980, "Yes"));
        books.add(new Book("Sienkiewicz", "Potop", 1985, "Yes"));
        books.add(new Book("Sienkiewicz", "Pan Wlodyjowski", 1990, "Yes"));
        books.add(new Book("Sienkiewicz", "Ogniem i mieczem", 1975, "Yes"));
//        books.stream()
//                .map(Book::getPublicationYear)
//                .collect(Collectors.toList());
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(publicationYearMedian);
        assertEquals(1980, publicationYearMedian,0);
    }
}

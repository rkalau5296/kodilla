package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        /* Then */
        Assert.assertEquals(0, theListOfBooks0.size());
        Assert.assertEquals(15, theListOfBooks15.size());
        Assert.assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksInHandsOfReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf1Books = generateListOfNBooks(1);
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        LibraryUser libraryUser1 = new LibraryUser("John", "Smith", "45010163574");
        LibraryUser libraryUser2 = new LibraryUser("Jack", "Adams", "45010163572");
        LibraryUser libraryUser3 = new LibraryUser("Marie", "Anderson", "45010163524");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2))
                .thenReturn(resultListOf1Books);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3))
                .thenReturn(resultListOf5Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(libraryUser3);

        // Then
        Assert.assertEquals(0, theListOfBooks0.size());
        Assert.assertEquals(1, theListOfBooks1.size());
        Assert.assertEquals(5, theListOfBooks5.size());
    }
}

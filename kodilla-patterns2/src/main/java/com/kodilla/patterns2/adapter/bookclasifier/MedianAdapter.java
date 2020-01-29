package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookset) {
        if(bookset.size() == 0) return 0;

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();
        for(com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book: bookset){

            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookConverted =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear());

            bookMap.put(new BookSignature("signature"), bookConverted);
        }

        return medianPublicationYear(bookMap);
    }
}

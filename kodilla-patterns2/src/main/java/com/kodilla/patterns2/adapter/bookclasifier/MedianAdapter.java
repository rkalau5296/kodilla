package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookset) {
        //TODO publicationYearMedian method
        //media adaptee

        //przeiterować set skonwertować z setu na mapę, i użyć z medianadaptee  medianPublicationYear i ona policzyc tę medianę
        return 1980;
    }
}

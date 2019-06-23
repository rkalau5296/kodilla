package com.kodilla.stream;


import com.kodilla.stream.Book.Book;
import com.kodilla.stream.Book.BookDirectory;
import com.kodilla.stream.ForumUser.Forum;
import com.kodilla.stream.ForumUser.ForumUser;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        String text = " This is a very beautiful text. ";
//        poemBeautifier.beautify("AAA", (a)->a + text + a);
//        poemBeautifier.beautify("AAA", (a)->text.toUpperCase());
//        poemBeautifier.beautify("AAA", (a)->text.toLowerCase());
//        poemBeautifier.beautify("AAA", (a)->"<<<<<"+text+">>>>>");
//        poemBeautifier.beautify("AAA", (a)->"****"+text+"****");

//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(b->b.getSignature(), book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(b->b.toString())
//                .collect(Collectors.joining(",\n","<<",">>"));
//        System.out.println(theResultMapOfBooks);
        Forum forum = new Forum();
        Map<Integer, ForumUser> par = forum.getUserList().stream()
                .filter(b -> b.getYearFromBirthDate() <= 1998)
                .filter(b -> b.getGender()=='M')
                .filter(b -> b.getPostQuantity()>=1)
                .collect(Collectors.toMap(b -> b.getUserId(), user->user));
        System.out.println("# elements: " + par.size());
        System.out.println(par);
    }
}

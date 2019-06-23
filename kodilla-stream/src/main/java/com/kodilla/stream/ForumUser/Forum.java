package com.kodilla.stream.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Piotr Kowalski", 'M',  LocalDate.of(2000, 6, 24), 0));
        theUserList.add(new ForumUser(2, "Adam Kwiatkowski", 'M', LocalDate.of(2000, 10, 15), 5));
        theUserList.add(new ForumUser(3, "Anna Lewandowska", 'F', LocalDate.of(1993, 10, 15), 6));
        theUserList.add(new ForumUser(4, "Katarzyna Michalska", 'F', LocalDate.of(1995, 10, 15), 1));
        theUserList.add(new ForumUser(5, "Tomasz Jaworski", 'M', LocalDate.of(1998, 10, 15), 2));
        theUserList.add(new ForumUser(6, "Piotr Kowalski", 'M', LocalDate.of(2001, 10, 15), 0));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUserList);
    }
}

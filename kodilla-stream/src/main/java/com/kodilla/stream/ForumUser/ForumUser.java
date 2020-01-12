package com.kodilla.stream.ForumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int postQuantity;

    public ForumUser(int userId, String userName, char gender, LocalDate birthDate, int postQuantity) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.postQuantity = postQuantity;
    }

    public int getYearFromBirthDate() {
        int year = getBirthDate().getYear();
        return year;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postQuantity=" + postQuantity +
                '}';
    }
}

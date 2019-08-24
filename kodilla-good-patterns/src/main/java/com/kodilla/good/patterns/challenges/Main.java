package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(a->a.getValue().stream())
                .forEach(System.out::println);
    }
}

package com.kodilla.good.patterns.trial;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
//        movieStore.getMovies().entrySet().stream()
//                .flatMap(a->a.getValue().stream())
//                .map(s->s.concat("!"))
//                .forEach(System.out::print );

        movieStore.getMovies().entrySet().stream().forEach(System.out::print);


    }
}

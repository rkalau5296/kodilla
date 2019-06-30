package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    int lenght;
    String name;

    public Square(int lenght, String name) {
        this.lenght = lenght;
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return lenght == square.lenght;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return lenght*lenght;
    }

    @Override
    public String toString() {
        return "Square{" +
                "lenght=" + lenght +
                ", name='" + name + '\'' +
                '}';
    }
}



package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    int lenght;

    public Square(int lenght) {
        this.lenght = lenght;
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
    public void getShapeName() {

    }

    @Override
    public void getField() {

    }

    @Override
    public int getShapeQuantity() {
        return getShapeQuantity();
    }
}

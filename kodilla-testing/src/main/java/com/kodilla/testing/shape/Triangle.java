package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    int lenght;
    int hieght;
    String name;

    public Triangle(int lenght, int hieght) {
        this.lenght = lenght;
        this.hieght = hieght;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHieght() {
        return hieght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return lenght == triangle.lenght &&
                hieght == triangle.hieght;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, hieght);
    }


    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (lenght*hieght)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "lenght=" + lenght +
                ", hieght=" + hieght +
                '}';
    }
}

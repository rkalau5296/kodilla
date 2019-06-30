package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
       ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){

        shapes.add(shape);
    }

    public Boolean removeFigure(Shape shape){

        return shapes.remove(shape);
    }

    public Shape getFigure (int n){

        return shapes.get(n);
    }

    public String showFigures(Shape shape){

        return shape.getShapeName() + " " + shape.getField();

    }


    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shapes=" + shapes +
                '}';
    }

}

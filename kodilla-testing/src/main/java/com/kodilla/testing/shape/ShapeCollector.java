package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {

        shapes.add(shape);
    }

    public Boolean removeFigure(Shape shape) {

        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {

        return shapes.get(n);
    }

    public String showFigures() {
        String allfigures = "";

        for (int i = 0; i < shapes.size(); i++) {
            allfigures += shapes.get(i).getShapeName() + " " + shapes.get(i).getField() + "\n";
        }

        return allfigures;

    }


    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shapes=" + shapes +
                '}';
    }

}

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

    public void showFigures(){

        for(int i = 0; i<shapes.size(); i++)
            System.out.println(shapes);

        //return text;
    }
    public int getShapesQuantity(){
        return shapes.size();
    }
}

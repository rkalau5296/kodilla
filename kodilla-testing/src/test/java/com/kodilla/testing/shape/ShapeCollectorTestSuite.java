package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Triangle(5,2));
        shapeCollector.addFigure(new Triangle(4,2));
        shapeCollector.addFigure(new Square(2));
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(new Square(5));

        //Then
        Assert.assertEquals(4, shapeCollector.shapes.size());

    }
    @Test
    public void testRemoveFigure (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Triangle(5,2));
        shapeCollector.addFigure(new Triangle(4,2));
        shapeCollector.addFigure(new Square(2));
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.removeFigure(new Circle(5));
        shapeCollector.removeFigure(new Triangle(5,2));
        shapeCollector.removeFigure(new Square(4));

        //Then
        Assert.assertEquals(4, shapeCollector.shapes.size());

    }
    @Test
    public void testGetFigure (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Triangle(5,2));
        shapeCollector.addFigure(new Triangle(4,2));
        shapeCollector.addFigure(new Square(2));
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(new Square(5));

        //Then
        Assert.assertEquals(shapeCollector.shapes.get(0), shapeCollector.getFigure(0));
        Assert.assertEquals(shapeCollector.shapes.get(1), shapeCollector.getFigure(1));
        Assert.assertEquals(shapeCollector.shapes.get(2), shapeCollector.getFigure(2));
        Assert.assertEquals(shapeCollector.shapes.get(3), shapeCollector.getFigure(3));
        Assert.assertEquals(shapeCollector.shapes.get(4), shapeCollector.getFigure(4));
        Assert.assertEquals(shapeCollector.shapes.get(5), shapeCollector.getFigure(5));
        Assert.assertEquals(shapeCollector.shapes.get(6), shapeCollector.getFigure(6));
    }
    @Test
    public void displayFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Triangle(5,2));
        shapeCollector.addFigure(new Triangle(4,2));
        shapeCollector.addFigure(new Square(2));
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(new Square(5));

        //Then
        shapeCollector.showFigures();

    }


}

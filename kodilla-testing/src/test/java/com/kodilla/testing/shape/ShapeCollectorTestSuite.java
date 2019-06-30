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
        shapeCollector.addFigure(new Circle(5, "Circle1"));
        shapeCollector.addFigure(new Circle(4, "Circle2"));
        shapeCollector.addFigure(new Triangle(5,2, "Triangle1"));
        shapeCollector.addFigure(new Triangle(4,2, "Triangle2"));
        shapeCollector.addFigure(new Square(2, "Square1"));
        shapeCollector.addFigure(new Square(4, "Square2"));
        shapeCollector.addFigure(new Square(5, "Square3"));

        //Then
        Assert.assertEquals(7, shapeCollector.shapes.size());

    }
    @Test
    public void testRemoveFigure (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(5, "Circle1"));
        shapeCollector.addFigure(new Circle(4, "Circle2"));
        shapeCollector.addFigure(new Triangle(5,2, "Triangle1"));
        shapeCollector.addFigure(new Triangle(4,2, "Triangle2"));
        shapeCollector.addFigure(new Square(2, "Square1"));
        shapeCollector.addFigure(new Square(4, "Square2"));
        shapeCollector.addFigure(new Square(5, "Square3"));
        shapeCollector.removeFigure(new Circle(5, "Circle1"));
        shapeCollector.removeFigure(new Circle(4, "Circle2"));
        shapeCollector.removeFigure(new Square(4, "Square2"));

        //Then
        Assert.assertEquals(4, shapeCollector.shapes.size());

    }
    @Test
    public void testGetFigure (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(5, "Circle1"));
        shapeCollector.addFigure(new Circle(4, "Circle2"));
        shapeCollector.addFigure(new Triangle(5,2, "Triangle1"));
        shapeCollector.addFigure(new Triangle(4,2, "Triangle2"));
        shapeCollector.addFigure(new Square(2, "Square1"));
        shapeCollector.addFigure(new Square(4, "Square2"));
        shapeCollector.addFigure(new Square(5, "Square3"));

        //Then
        Assert.assertEquals(shapeCollector.shapes.get(0), shapeCollector.getFigure(0));
//        Assert.assertEquals(shapeCollector.shapes.get(1), shapeCollector.getFigure(1));
//        Assert.assertEquals(shapeCollector.shapes.get(2), shapeCollector.getFigure(2));
//        Assert.assertEquals(shapeCollector.shapes.get(3), shapeCollector.getFigure(3));
//        Assert.assertEquals(shapeCollector.shapes.get(4), shapeCollector.getFigure(4));
//        Assert.assertEquals(shapeCollector.shapes.get(5), shapeCollector.getFigure(5));
//        Assert.assertEquals(shapeCollector.shapes.get(6), shapeCollector.getFigure(6));
        System.out.println(shapeCollector.getFigure(0));
    }
    @Test
    public void displayFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(5, "Circle1"));
        shapeCollector.addFigure(new Circle(4, "Circle2"));
        shapeCollector.addFigure(new Triangle(5,2, "Triangle1"));
        shapeCollector.addFigure(new Triangle(4,2, "Triangle2"));
        shapeCollector.addFigure(new Square(2, "Square1"));
        shapeCollector.addFigure(new Square(4, "Square2"));
        shapeCollector.addFigure(new Square(5, "Square3"));

        //Then
        Assert.assertEquals("Circle1 78.5", shapeCollector.showFigures(shapeCollector.getFigure(0)));
        Assert.assertEquals("Circle2 50.24", shapeCollector.showFigures(shapeCollector.getFigure(1)));
        Assert.assertEquals("Triangle1 5.0", shapeCollector.showFigures(shapeCollector.getFigure(2)));
        Assert.assertEquals("Triangle2 4.0", shapeCollector.showFigures(shapeCollector.getFigure(3)));
        Assert.assertEquals("Square1 4.0", shapeCollector.showFigures(shapeCollector.getFigure(4)));
        Assert.assertEquals("Square2 16.0", shapeCollector.showFigures(shapeCollector.getFigure(5)));
        Assert.assertEquals("Square3 25.0", shapeCollector.showFigures(shapeCollector.getFigure(6)));



    }


}

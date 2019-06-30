package com.kodilla.testing.shape;

import org.junit.*;

public class
ShapeCollectorTestSuite {
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
        Assert.assertEquals(new Circle(5, "Circle1"), shapeCollector.getFigure(0));
        Assert.assertEquals(new Circle(4, "Circle2"), shapeCollector.getFigure(1));
        Assert.assertEquals(new Triangle(5,2, "Triangle1"), shapeCollector.getFigure(2));
        Assert.assertEquals(new Triangle(4,2, "Triangle2"), shapeCollector.getFigure(3));
        Assert.assertEquals(new Square(2, "Square1"), shapeCollector.getFigure(4));
        Assert.assertEquals(new Square(4, "Square2"), shapeCollector.getFigure(5));
        Assert.assertEquals(new Square(5, "Square3"), shapeCollector.getFigure(6));
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
        String expected = "Circle1 78.5" +"\n"+
                "Circle2 50.24" + "\n" +
                "Triangle1 5.0" +"\n"+
                "Triangle2 4.0" +"\n"+
                "Square1 4.0" +"\n"+
                "Square2 16.0" +"\n"+
                "Square3 25.0"+"\n";
        Assert.assertEquals(expected, shapeCollector.showFigures());
        //System.out.println(expected);




    }


}

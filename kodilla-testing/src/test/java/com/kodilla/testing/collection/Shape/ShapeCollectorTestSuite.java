package com.kodilla.testing.collection.Shape;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
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
    public void addFigure (){
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
        Assert.assertEquals(3, shapeCollector.getShapesQuantity());
    }
    @Test
    public void removeFigure (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.removeFigure(new Circle(5));
        shapeCollector.removeFigure(new Triangle(5,2));
        shapeCollector.removeFigure(new Square(4));

        //Then
        //Assert.assertNotEquals();
    }
    @Test
    public void getFigure (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.getFigure(2);
        shapeCollector.getFigure(1);
        shapeCollector.getFigure(8);

        //Then
        //Assert.assertEquals();
    }
    @Test
    public void showFigures (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.showFigures();
        shapeCollector.showFigures();

        //Then
        //Assert.assertEquals();
    }
}

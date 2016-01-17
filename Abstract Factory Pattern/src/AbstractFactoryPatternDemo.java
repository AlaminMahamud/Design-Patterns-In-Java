import AbstractFactory.*;
import AbstractFactory.Color.Color;
import AbstractFactory.Shape.Shape;

/**
 * Created by root on 1/17/2016.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args)
    {
        // get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        // get Shape Object
        Shape rectangle = ((ShapeFactory)shapeFactory).getShape("Rectangle");
        Shape circle = ((ShapeFactory)shapeFactory).getShape("Circle");
        Shape square = ((ShapeFactory)shapeFactory).getShape("Square");

        // call Shape Object Method
        rectangle.draw();
        square.draw();
        circle.draw();

        // get Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        // get an object of Color
        Color red = ((ColorFactory)colorFactory).getColor("red");
        Color green = ((ColorFactory) colorFactory).getColor("green");
        Color blue = ((ColorFactory)colorFactory).getColor("blue");

        // call color methods
        red.fill();
        green.fill();
        blue.fill();
    }
}

import Shapes.Shape;

/**
 * Created by root on 1/15/2016.
 */

public class DemoShape {
    public static void main(String[] args)
    {
        // Instantiate the Factory
        ShapeFactory shapeFactory = new ShapeFactory();

        // get the product
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // draw it
        shape1.draw();

        // get the product
        Shape shape2 = shapeFactory.getShape("Rectangle");
        // draw it
        shape2.draw();

        // get the product
        Shape shape3 = shapeFactory.getShape("SqUare");
        // draw it
        shape3.draw();
    }
}

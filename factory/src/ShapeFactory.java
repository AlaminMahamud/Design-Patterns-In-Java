import Shapes.*;

/**
 * Created by root on 1/15/2016.
 */

public class ShapeFactory {
    public Shape getShape(String s)
    {
        if(s.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(s.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(s.equalsIgnoreCase("Square"))
            return new Square();
        return null;
    }
}

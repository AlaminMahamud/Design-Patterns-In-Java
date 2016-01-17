package AbstractFactory;

import AbstractFactory.Color.*;
import AbstractFactory.Shape.*;

/**
 * Created by root on 1/17/2016.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType)
    {
        if(shapeType == null)
            return null;

        else if(shapeType.equalsIgnoreCase("Circle"))
            return new Circle();

        else if(shapeType.equalsIgnoreCase("Square"))
            return new Square();

        else if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();

        return null;
    }

    @Override
    public Color getColor(String colorType)
    {
        return null;
    }
}

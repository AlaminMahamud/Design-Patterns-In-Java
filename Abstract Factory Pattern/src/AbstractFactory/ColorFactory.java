package AbstractFactory;

import AbstractFactory.Color.*;
import AbstractFactory.Shape.Shape;

/**
 * Created by root on 1/17/2016.
 */

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType)
    {
        return null;
    }

    @Override
    public Color getColor(String colorType)
    {
        if(colorType== null)
            return null;

        else if(colorType.equalsIgnoreCase("Red"))
            return new Red();

        else if(colorType.equalsIgnoreCase("Green"))
            return new Green();

        else if(colorType.equalsIgnoreCase("Blue"))
            return new Blue();

        return null;
    }
}

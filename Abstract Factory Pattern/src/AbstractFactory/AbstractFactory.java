package AbstractFactory; /**
 * Created by root on 1/17/2016.
 */

import AbstractFactory.Shape.Shape;
import AbstractFactory.Color.Color;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

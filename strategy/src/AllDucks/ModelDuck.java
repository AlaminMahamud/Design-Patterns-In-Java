package AllDucks;

import AllDucks.Behavior.FlyBehavior.FlyNoWay;
import AllDucks.Behavior.QuackBehavior.Quack;

/**
 * Created by Root on 1/11/2016.
 */

public class ModelDuck extends Duck{

    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}

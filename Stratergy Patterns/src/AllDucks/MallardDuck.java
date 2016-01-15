package AllDucks;

import AllDucks.Behavior.FlyBehavior.FlyWithWings;
import AllDucks.Behavior.QuackBehavior.Quack;

/**
 * Created by Root on 1/11/2016.
 */

public class MallardDuck extends Duck{
    public MallardDuck()
    {
        quackBehavior = new Quack();
        flyBehavior   = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

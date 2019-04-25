package AllDucks;

import AllDucks.Behavior.FlyBehavior.FlyWithWings;
import AllDucks.Behavior.QuackBehavior.Quack;

/**
 * Created by Root on 1/11/2016.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}

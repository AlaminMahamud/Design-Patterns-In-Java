package AllDucks;

import AllDucks.Behavior.FlyBehavior.FlyNoWay;
import AllDucks.Behavior.QuackBehavior.Squeak;

/**
 * Created by Root on 1/11/2016.
 */

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}

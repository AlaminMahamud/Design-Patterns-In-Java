package AllDucks;

import AllDucks.Behavior.FlyBehavior.FlyNoWay;
import AllDucks.Behavior.QuackBehavior.MuteQuack;

/**
 * Created by Root on 1/11/2016.
 */

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}

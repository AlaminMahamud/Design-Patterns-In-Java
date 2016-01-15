package AllDucks;
import AllDucks.Behavior.FlyBehavior.FlyBehavior;
import AllDucks.Behavior.QuackBehavior.QuackBehavior;

/**
 * Created by Root on 1/11/2016.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }

    // applicable to all ducks
    public void swim(){System.out.println("All ducks float, even decoys");}

    // every duck will adopt to its need
    abstract void display();

    // set the fly and quack behavior
    public void setFlyBehavior(FlyBehavior fb){flyBehavior = fb;}
    public void setQuackBehavior(QuackBehavior qb){quackBehavior = qb;}

    // perform fly and quack
    public void performFly(){flyBehavior.fly();}
    public void performQuack(){quackBehavior.quack();}

}

import AllDucks.*;
import AllDucks.Behavior.FlyBehavior.FlyRocketPowered;
import AllDucks.Behavior.QuackBehavior.MuteQuack;

/**
 * Created by Root on 1/11/2016.
 */


public class MiniDuckSimulator {
    public static void main(String[] args){

        MallardDuck mallardDuck;
        RubberDuck rubberDuck;
        RedHeadDuck redHeadDuck;
        DecoyDuck decoyDuck;
        ModelDuck modelDuck;

        mallardDuck = new MallardDuck();
        modelDuck = new ModelDuck();
        decoyDuck = new DecoyDuck();
        redHeadDuck = new RedHeadDuck();
        rubberDuck = new RubberDuck();

        mallardDuck.performQuack();
        mallardDuck.performFly();

        redHeadDuck.performQuack();
        redHeadDuck.performFly();

        decoyDuck.performQuack();
        decoyDuck.performFly();

        rubberDuck.performQuack();
        rubberDuck.performFly();

        modelDuck.performQuack();
        modelDuck.performFly();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.setQuackBehavior(new MuteQuack());

        modelDuck.performFly();
        modelDuck.performQuack();
    }
}

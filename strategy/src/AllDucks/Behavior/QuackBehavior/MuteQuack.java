package AllDucks.Behavior.QuackBehavior;

/**
 * Created by Root on 1/11/2016.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

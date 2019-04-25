/**
 * Created by root on 1/17/2016.
 */
public class Demo {
    public static void main(String[] args)
    {
        // illegal construct
        // compile time error: The Constructor SingleObject() is not visible
        // SingleObject instance = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // Show the Message
        object.MyMessage();
    }
}

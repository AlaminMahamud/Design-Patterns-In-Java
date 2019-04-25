/**
 * Created by root on 1/17/2016.
 */
public class SingleObject
{
    // crate an object of SingleObject
        private static SingleObject myInstance = new SingleObject();

    // make the constructor private so that this class cannot be
    // instantiated
        private SingleObject(){}

    // Get the only object available
        public static SingleObject getInstance()
        {
            return myInstance;
        }

    // Functionality
        public void MyMessage()
        {
            System.out.println("Hello World From Singleton Pattern");
        }
}

/**
 * Created by root on 1/17/2016.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing()
    {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

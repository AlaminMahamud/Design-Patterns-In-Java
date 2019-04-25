/**
 * Created by root on 1/17/2016.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing()
    {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

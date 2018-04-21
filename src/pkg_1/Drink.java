package pkg_1;

/**
 * Created by User on 4/21/2018.
 */



public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Cup();
    }

    @Override
    public abstract float price();
}
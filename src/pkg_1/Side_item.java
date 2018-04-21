package pkg_1;

/**
 * Created by User on 4/21/2018.
 */



public abstract class Side_item implements Item {

    @Override
    public Packing packing() {
        return new Bag();
    }

    @Override
    public abstract float price();
}
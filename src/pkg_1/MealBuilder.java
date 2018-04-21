package pkg_1;

/**
 * Created by User on 4/21/2018.
 */


public class MealBuilder {

    public Meal prepareHamburger (){
        Meal meal = new Meal();
        meal.addItem(new Hamburger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareCheeseburger (){
        Meal meal = new Meal();
        meal.addItem(new Cheeseburger());
        meal.addItem(new Coke());
        return meal;
    }


    public Meal prepareChicken (){
        Meal meal = new Meal();
        meal.addItem(new Chicken());
        meal.addItem(new Coke());
        return meal;
    }






}
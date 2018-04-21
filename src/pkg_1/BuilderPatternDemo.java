package pkg_1;

/**
 * Created by User on 4/21/2018.
 */




public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal HamburgerMeal = mealBuilder.prepareHamburger();
        System.out.println("hamburger as main  Meal");
    /*    vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
*/
        Meal CheeseburgerMeal = mealBuilder.prepareCheeseburger();
        System.out.println("\n\n cheeseburger as main  Meal");
   /*     nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
*/

        Meal ChickenMeal = mealBuilder.prepareChicken();
        System.out.println("\n\n Chickenburger as main Meal");
  /*      nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
*/







    }
}
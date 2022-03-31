import java.util.Locale;

class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    static int totalDishes = 0;

    public Dish(){
        totalDishes++;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public static int getTotalDishes() {
        return totalDishes;
    }

    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this();
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary(){
        System.out.printf("Cost: %d\nName: %s\nRecommended: %s\n\n", costInCents, nameOfDish, wouldRecommend);
    }
}

class DishTools{

    public static int AVG_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish dish){
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish dish, int AVG_COST_OF_DISH_IN_CENTS){
        if(dish.getCostInCents() > AVG_COST_OF_DISH_IN_CENTS){
            System.out.println("This dish is above the average cost.");
        } else {
            System.out.println("This dish is below the average cost.");
        }
    }

    public static void flipRecommendation(Dish dish){
      dish.setWouldRecommend(!dish.isWouldRecommend());
    }

    public static void setAveragePrice(Dish dish){
        dish.setCostInCents(AVG_COST_OF_DISH_IN_CENTS);
    }

}


class DishTest {
    public static void main(String[] args){
//        Dish dish1 = new Dish();
//
//        dish1.costInCents = 900;
//        dish1.nameOfDish = "falafel";
//        dish1.wouldRecommend = true;

        Dish dish1 = new Dish(900, "falafel", true);
        dish1.printSummary();

        Dish dish2 = new Dish(700, "asada tacos", true);
        dish2.printSummary();

        Dish dish3 = new Dish(1000, "cheese burger", false);
        dish3.printSummary();

        System.out.println("There are " + Dish.totalDishes + " total dishes.");

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1, DishTools.AVG_COST_OF_DISH_IN_CENTS);
        DishTools.flipRecommendation(dish3);
        DishTools.setAveragePrice(dish3);
        dish3.printSummary();
    }
}

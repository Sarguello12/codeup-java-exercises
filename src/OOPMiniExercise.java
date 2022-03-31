class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void createDish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary(){
        System.out.printf("Cost: %d%nName: %s%nRecommended: %s%n%n", costInCents, nameOfDish, wouldRecommend);
    }
}


class DishTest {
    public static void main(String[] args){
//        Dish dish1 = new Dish();
//
//        dish1.costInCents = 900;
//        dish1.nameOfDish = "falafel";
//        dish1.wouldRecommend = true;


        Dish dish1 = new Dish();
        dish1.createDish(900, "falafel", true);
        dish1.printSummary();

        Dish dish2 = new Dish();
        dish2.createDish(700, "asada tacos", true);
        dish2.printSummary();

        Dish dish3 = new Dish();
        dish3.createDish(1000, "cheese burger", false);
        dish3.printSummary();

    }
}


public class OOPMiniExercise {

}

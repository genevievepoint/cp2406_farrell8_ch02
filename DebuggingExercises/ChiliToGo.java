import java.util.Scanner;

public class ChiliToGo {

    public static void main(String[] args){
        int AdultMeal = 7;
        int ChildMeal = 7;
        double numAdultMeal;
        double numChildMeal;
        double AdultTotal;
        double ChildTotal;
        double MealTotal;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter the number of Adult meals>>> ");
        numAdultMeal = inputDevice.nextDouble();

        Scanner inputDevice1 = new Scanner(System.in);
        System.out.print("Please enter the number of Child meals>>> ");
        numChildMeal = inputDevice1.nextDouble();

        AdultTotal = numAdultMeal * AdultMeal;
        ChildTotal = numChildMeal * ChildMeal;
        MealTotal = (numAdultMeal * AdultMeal) + (numChildMeal * ChildMeal);

        System.out.print("The total for Adult Meals  is $" + AdultTotal);
        System.out.print(" The total for Child Meals is $" + ChildTotal);
        System.out.print(" The grand total is $" + MealTotal);

    }
}

import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args){
        int AdultMeal = 7;
        int ChildMeal = 7;
        double numAdultMeal;
        double numChildMeal;
        double AdultCost = 4.35;
        double ChildCost = 3.10;
        double AdultTotal;
        double ChildTotal;
        double MealTotal;
        double AdultProfit;
        double ChildProfit;
        double TotalProfit;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter the number of Adult meals>>> ");
        numAdultMeal = inputDevice.nextDouble();

        Scanner inputDevice1 = new Scanner(System.in);
        System.out.print("Please enter the number of Child meals>>> ");
        numChildMeal = inputDevice1.nextDouble();

        AdultTotal = numAdultMeal * AdultMeal;
        ChildTotal = numChildMeal * ChildMeal;
        MealTotal = AdultTotal + ChildTotal;
        AdultProfit = numAdultMeal * AdultCost;
        ChildProfit = numChildMeal * ChildCost;
        TotalProfit = AdultProfit + ChildProfit;

        System.out.println("The total for Adult Meals  is $" + AdultTotal);
        System.out.println("The total for Child Meals is $" + ChildTotal);
        System.out.println("The grand total is $" + MealTotal);
        System.out.println("The total Profit for Adult Meals  is $" + AdultProfit);
        System.out.println("The total profit is $" + TotalProfit);

    }
}

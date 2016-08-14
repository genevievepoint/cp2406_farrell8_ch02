import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args){
        double KMinNauticalMile = 1.852;
        double MinNauticalMile = 1.150779;
        int miles;
        int km;

        Scanner inputDevice = new Scanner (System.in);
        System.out.print("Please enter the amount of miles>>> ");
        miles = inputDevice.nextInt();
        Scanner inputDevice1 = new Scanner (System.in);
        System.out.print("Please enter the amount of kilometers>>> ");
        km = inputDevice1.nextInt();


        double MtoNauticalMile = miles / MinNauticalMile;
        double KmtoNauticalMile = km / KMinNauticalMile;

        System.out.print(miles + " miles is equal to " + MtoNauticalMile + " nautical miles. " + km + " kilometers is" +
                " " + "equal to " + KmtoNauticalMile + " nautical miles.");


    }
}

import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        int QuartsInGallons = 4;
        int PaintJob;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please Enter the amount of paint required >> ");
        PaintJob = inputDevice.nextInt();

        int Gallons = PaintJob / QuartsInGallons;
        int Quarts = PaintJob % Gallons;


        System.out.print("A Job that needs " + PaintJob + " quarts requires " + Gallons + " gallons plus " + Quarts +
                " quarts.");
    }
}

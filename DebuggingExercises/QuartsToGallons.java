/**
 * Created by Genevieve on 08-Aug-16.
 */
public class QuartsToGallons {

    public static void main(String[] args){
        int QuartsInGallons = 4;
        int PaintJob = 18;

        int Gallons = PaintJob / QuartsInGallons;
        int Quarts = PaintJob % Gallons;


        System.out.print("A Job that needs " + PaintJob + " quarts requires " + Gallons + " gallons plus " + Quarts +
                " quarts.");


    }
}

public class NauticalMiles {
    public static void main(String[] args){
        double KMinNauticalMile = 1.852;
        double MinNauticalMile = 1.150779;
        int miles = 21;
        int km = 21;

        double MtoNauticalMile = miles / MinNauticalMile;
        double KmtoNauticalMile = km / KMinNauticalMile;

        System.out.print(miles + " miles is equal to " + MtoNauticalMile + " nautical miles. " + km + " kilometers is" +
                " " + "equal to " + KmtoNauticalMile + " nautical miles.");


    }
}

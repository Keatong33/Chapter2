import java.util.Scanner;
public class NauticalMilesInteractive {
    public static void main(String [] args){
        final double NAUTICAL_MILES_TO_MILES = 1.150779;
        final double NAUTICAL_MILES_TO_KILOMETERS = 1.852;
        double numberOfMiles;
        double  numberOfKilometers;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number of nautical miles");
        numberOfMiles = keyboard.nextDouble();
        //numberOfMiles =  numberOfKilometers /  NAUTICAL_MILES_TO_MILES;
        numberOfKilometers =  numberOfMiles /  NAUTICAL_MILES_TO_KILOMETERS;
        System.out.println("The number of miles is" + numberOfMiles
                + "And the number of miles remaining is" + numberOfKilometers);








    }
}

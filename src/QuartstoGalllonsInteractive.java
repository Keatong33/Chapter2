import java.util.Scanner;
public class QuartstoGalllonsInteractive {
    public static void main(String [] args){
        int numberOfQuartsInputed;
        final int NUM_QUARTS_IN_GALLON = 4;
        int remainderOfQuarts;
        int numberOfGallons;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of quarts needed to do the job>>>");
        numberOfQuartsInputed = keyboard.nextInt();
        numberOfGallons = numberOfQuartsInputed / NUM_QUARTS_IN_GALLON;
        remainderOfQuarts = numberOfQuartsInputed % NUM_QUARTS_IN_GALLON;
        System.out.println("The number of gallons ordered is " + numberOfGallons +
                " and the number of quarts remainig is " + remainderOfQuarts);
    }
}

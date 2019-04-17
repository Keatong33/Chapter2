import java.util.Scanner;

public class Eggs {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        double PRICE_OF_DOZEN = 3.25;
        double PRICE_OF_EGG = .45;
        int dozenOfEggs;
        int remainderOfEggs;
        int eggsOrdered;
        System.out.println("Please Tell Me Your Order>>>");
        eggsOrdered = keyboard.nextInt();
        remainderOfEggs = eggsOrdered % 12;
        dozenOfEggs = eggsOrdered / 12;
       PRICE_OF_DOZEN = dozenOfEggs * 3.25;
       PRICE_OF_EGG = remainderOfEggs * .45;
       System.out.println("Your Total Is" + PRICE_OF_DOZEN + PRICE_OF_EGG);






    }
}

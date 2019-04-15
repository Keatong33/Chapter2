import java.util.Scanner;
public class IntegerDemoInteractiveWithName {
    public static void main(String[] args) {
        int anInt = 12;
        byte aByte = 12;
        short aShort = 12345;
        long aLong = 1234567890987654321L;
        System.out.println("The int is" + anInt);
        System.out.println("The byte is" + aByte);
        System.out.println("The short is" + aShort);
        System.out.println("The long is" + aLong);
        int anotherInt = anInt * 10000000;
        System.out.println("Another int is" + anotherInt);
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer >>");
        anInt = input.nextInt();
        System.out.print("Please enter a byte integer >>");
        aByte = input.nextByte();
        System.out.print("Please enter a short integer >>");
        aShort = input.nextShort();
        System.out.print("Please enter a long integer >>");
        aLong = input.nextLong();
        String name;
        System.out.print("Please enter your name >>");
        name = input.nextLine();
        System.out.println("Thank you," + name);
        input.nextLine();

    }
}

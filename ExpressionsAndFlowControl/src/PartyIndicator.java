//public class PartyIndicator {
//    public static void main(String[] args) {
//        // Write a program that asks for two numbers
//        // The first number represents the number of girls that comes to a party,
//        // the second represents the number of boys
//        //
//        // If the number of girls and boys are equal and 20 or more people are
//        // coming to the party, it should print: The party is excellent!
//        //
//        // If there are 20 or more people coming to the party but the girl - boy
//        // ratio is not 1-1, it should print: Quite a cool party!
//        //
//        // If there are fewer than 20 people coming,
//        // it should print: Average party...
//        //
//        // If no girls are coming, regardless the count of the people,
//        // it should print: Sausage party
//        //
//        // Please enter the number of girls: 15
//        // Please enter the number of boys: 25
//        // Quite a cool party!
//    }
//}
import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of girls: ");
        int numberGirls = scanner.nextInt();
        System.out.println("Please enter the number of boys: ");
        int numberBoys = scanner.nextInt();

        if ((numberBoys == numberGirls) && ((numberBoys + numberGirls) >= 20)) {
            System.out.println("The party is excellent!");
        } else if (numberGirls <= 0) {
            System.out.println("Sausage party");
        } else if ((numberBoys != numberGirls) && ((numberBoys + numberGirls) >= 20)) {
            System.out.println("Quite a cool party!");
        } else if ((numberBoys + numberGirls) < 20) {
            System.out.println("Average party...");
        }
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party,
        // the second represents the number of boys
        //
        // If the number of girls and boys are equal and 20 or more people are
        // coming to the party, it should print: The party is excellent!
        //
        // If there are 20 or more people coming to the party but the girl - boy
        // ratio is not 1-1, it should print: Quite a cool party!
        //
        // If there are fewer than 20 people coming,
        // it should print: Average party...
        //
        // If no girls are coming, regardless the count of the people,
        // it should print: Sausage party
        //
        // Please enter the number of girls: 15
        // Please enter the number of boys: 25
        // Quite a cool party!
    }
}
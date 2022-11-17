//public class PrintBigger {
//    public static void main(String[] args) {
//        // Write a program that asks for two numbers and prints the bigger one
//    }
//}
import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int firstScan = scanner.nextInt();
        System.out.println("Please enter a number: ");
        int secondScan = scanner.nextInt();

        if ( firstScan > secondScan) {
            System.out.println(firstScan);

        }else {
            System.out.println(secondScan);
        }
    }
}
//public class OddEven {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input,
//        // then prints "Odd" if the number is odd, or "Even" if it is even
//        //
//        // Please enter a number: 7
//        // Odd
//    }
//}
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int numberInput = scanner.nextInt();
        if ((numberInput % 2) == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        //
        // Please enter a number: 7
        // Odd
    }
}
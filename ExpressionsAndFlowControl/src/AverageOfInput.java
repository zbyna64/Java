//public class AverageOfInput {
//    public static void main(String[] args) {
//        // Write a program promots the user for 5 integers in a row,
//        // then it prints their sum and their average:
//        //
//        // Please enter a number: 3
//        // Please enter a number: 7
//        // Please enter a number: 1
//        // Please enter a number: 6
//        // Please enter a number: 5
//        // Sum: 22, Average: 4.4
//        //
//    }
//}

import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int no1 = scanner.nextInt();
        System.out.println("Please enter a number: ");
        int no2 = scanner.nextInt();
        System.out.println("Please enter a number: ");
        int no3 = scanner.nextInt();
        System.out.println("Please enter a number: ");
        int no4 = scanner.nextInt();
        System.out.println("Please enter a number: ");
        int no5 = scanner.nextInt();

        int sumOfInputs = no1 + no2 + no3 + no4 + no5;
        double averageOfInputs = (double) sumOfInputs / 5;

        System.out.println("Sum: " + sumOfInputs + ", Average: " + averageOfInputs);
    }
}
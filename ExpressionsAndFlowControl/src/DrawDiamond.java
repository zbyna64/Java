//public class DrawDiamond {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a diamond of the specified height
//        //
//        // Example:
//        //
//        // Please enter the diamond height: 4
//        //    *
//        //   ***
//        //  *****
//        // *******
//        //  *****
//        //   ***
//        //    *
//        //
//        // Note: the height of the diamond is taken from its base
//        // (where it is the widest) to the top.
//        // The total number of lines produced is 2*height-1
//    }
//
//    public static void draw(int size){
//        // Write your code to draw the diamond here
//    }
//}

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the diamond height: ");
        int diamondSize = scanner.nextInt();
        draw(diamondSize);

        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // Note: the height of the diamond is taken from its base
        // (where it is the widest) to the top.
        // The total number of lines produced is 2*height-1
    }

    public static void draw(int size) {
            for (int i = 1; i < 2 * size; i++) {
                if (i <= size) {

                for (int j = 1; j <= ((2 * i) - 1); j++) {
                    for (int k = (size - i); k >= j && (j == 1); k--) {
                        System.out.print(" ");
                    }
                    System.out.print("*" + "");
                }
                System.out.println(" ");
            } else {
                        for (int j = -i; j <=(i - size); j--) {
                            for (int k = (size - i); k >= j && (j == 1); k--) {
                                System.out.print(" ");
                            }
                            System.out.print("*" + "");
                        }
                        System.out.println(" ");
                    }
                }
        }
    }


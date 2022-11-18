//public class DrawPyramid {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a pyramid of the specified height
//        //
//        // Example:
//        //
//        // Please enter the pyramid height: 4
//        //    *
//        //   ***
//        //  *****
//        // *******
//    }
//
//    public static void draw(int height){
//        // Write your code to draw the pyramid here
//    }
//}
import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the pyramid height: ");
        int pyramidHeight = scanner.nextInt();
        draw(pyramidHeight);
    }

    public static void draw(int height){
        for (int i = 1; i <= height; i++) {

            for (int k = (height - i); k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) -1); j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
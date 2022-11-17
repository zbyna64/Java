//public class HelloUser {
//    public static void main(String[] args) {
//        // Modify this program to greet the User instead of the World!
//        // The program should ask for the name of the User
//        //
//        // Example:
//        //
//        // Please entre your name: John Doe
//        // Hello, John Doe!
//        //
//        System.out.println("Hello, World!");
//    }
//}

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please entre your name");
        String scanName = myScanner.nextLine();

        System.out.println("Hello, " + scanName);
    }
}
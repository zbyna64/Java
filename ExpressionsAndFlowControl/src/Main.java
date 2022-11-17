import java.util.Scanner;

public class Main {                             // <Main> class
    public static void main(String[] args) {    //main method
        // vnitrek zavorky je method

        System.out.println("Hello world!");     //statement

        // variables
        // String = type of variable
        // anything = name of variable
        // 'Zbyna' = value of variable anything
        String thisIsMyName = "Zbyna";

        System.out.println(thisIsMyName);

        int num;    //declaration of variable
        num =5;     //assign a value to variable

            char letter = 'a';
        System.out.println((int) letter);


        /*
            primitives: variable types (data types)
                = something "burned" into the language
              signed variables: have "+" or "-" sign
                - boolean
                        1 -> 2^1   -> true/false
                - byte
                        8 bits -> 2^8              range: -128 <-> 127
                - short
                        16 bits -> 2^16
                - char
                        16 bits -> 2^16 -> 'a'
                        related to ascii character table
                - int
                        (integer) = whole number
                        32 bits -> 2^31 (because of sign takes one place)
                        biggest number is (2^31 -1) (because of 0)
                        smallest number is (-2^31)  (dont count 0 anymore)
                 - float
                        floating number
                        32 bits -> (2^32)
                        example: 21321.456476f --- use f at the end to indicate
                 - double
                        floating number
                        64 bits -> (2^64)

                 - long
                        integer number
                        64 bits -> (2^64)
                        example: 324324564L   --- use L at the end to indicate


                Objects:
                    =
                    -String
                    -Boolean
                    -Byte
                    -Short
                    -Character
                    -Integer
                    -Double
                    -Float
                    -Long
        */

        //boolean logic
        boolean booleanExample = true; //true: 1, false: 0
        Boolean isBiggerThan25 = true;

                //equality operators
                   // 705 == 705
                  //  750 != 705

               //relational operators
                  //  705 > 600
                  //  705 >= 600


                // logical operators (OR, AND, !)
                boolean orExample = true || false;  //true
                boolean andExample = true && true;  //true
                boolean notExample = !true;         //false

                boolean negateExample = !true;     //false


        System.out.println(orExample);
        System.out.println(andExample);
        System.out.println(notExample);
        //if true, do something, otherwise don't
        if (10 > 5) {
            System.out.println("pravda 10 je vetsi nez 5");
        }

        double toCast = 565451312313212312313212321.45;
        int castedCast = (int)(toCast);
        System.out.println(castedCast);

        // output: 2417483647 , ale cekame 565451351 atd



        //input user, udelat scanner

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = newScanner.nextInt();
        System.out.println("Your age is : " + age);
        System.out.println("Enter your name: ");
        String name = newScanner.next();

        //While loops
        boolean isAwake = true;
        int km = 0;
        while(isAwake) {
            System.out.println("Are we there yet?" + km);

            if (km > 15) {
                isAwake = false;
            }
            km+=1;
        }


        String userInput = newScanner.nextLine();
        do {
            userInput = newScanner.nextLine();
        }while (userInput.equals("yes"));


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i: " + i + " j: " + j);
            }
        }


        //Ternary operators
        // condition ? if true : if false

        System.out.println(50 < 51 ? "Number is smaller than 51" : "Number is bigger than 51");
    }
}
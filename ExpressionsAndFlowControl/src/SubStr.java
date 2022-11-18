//public class SubStr {
//    public static void main(String[] args) {
//        // Create a function that takes two strings as a parameter
//        // Returns the starting index where
//        // the second one is starting in the first one
//        // Returns `-1` if the second string is not in the first one
//
//        // Example:
//
//        // should print: `17`
//        System.out.println(subStr("this is what I'm searching in", "searching"));
//
//        // should print: `-1`
//        System.out.println(subStr("this is what I'm searching in", "not"));
//    }
//
//    public static int subStr(String input, String q) {
//        return -1;
//    }
//}

public class SubStr {
    public static void main(String[] args) {
//        subStr("conor is over rated", "koko");

                                                                                                   //zavedu int indexNumber, ktera se rovna vysledku
        System.out.println(subStr("this is what I'm searching in", "searching"));
        System.out.println(subStr("this is what I'm searching in", "not"));

                                                                                                     //subStr metody (funkce), ktera vraci: promennou
    }                                                                                               //indexNumber nebo -1 (to je default nastaveni indexOf)
                                                                                                     //musim zavest promenou v obou SCOPEch
    public static int subStr(String input, String q) {
        return input.indexOf(q);                                                                     //a v main method budu provadet print
    }                                                                                               //indexOf hleda kde je zacatek toho hledaneho vyrazu (pocita se od 0)
}
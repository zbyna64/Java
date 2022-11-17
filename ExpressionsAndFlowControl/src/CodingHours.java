//public class CodingHours {
//    public static void main(String[] args) {
//        // An average Green Fox attendee codes 6 hours daily
//        // The semester is 17 weeks long
//        //
//        // Print how many hours is spent with coding in a semester by an attendee,
//        // if the attendee only codes on workdays.
//        //
//        // Print the percentage of the coding hours in the semester if the average
//        // work hours weekly is 52
//    }
//}

public class CodingHours {
    public static void main(String[] args) {
     int dailyCodingTime = 6;
     int weeksInSemester = 17;
     int workingDays =5;
     int workingHoursWeekly = 52;

     int codingHours = dailyCodingTime * workingDays * weeksInSemester;
     int timeTotal = (workingHoursWeekly * weeksInSemester);

     double percentageOfCoding = codingHours / (double) timeTotal;

        System.out.println(codingHours);
        System.out.println((percentageOfCoding * 100));
    }
}
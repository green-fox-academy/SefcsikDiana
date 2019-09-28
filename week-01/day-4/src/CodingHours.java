public class CodingHours {
    public static void main(String[] args) {

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        // work hours weekly is 52
        int codingHours = 6;
        double oneWeekHours = 30;
        int semester = 17;
        int week = 52;
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        double attendeeCodingHours = oneWeekHours * semester;
        System.out.println("An attendee spends " + attendeeCodingHours + " coding hours.");

        // Print the percentage of the coding hours in the semester if the average
        double percentage = Math.round(100 * (oneWeekHours / week));
        System.out.println("The percentage of the coding hours in the semester: " + percentage + " % ." );


    }
}

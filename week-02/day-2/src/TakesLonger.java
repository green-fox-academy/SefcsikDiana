// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)
public class TakesLonger{
        public static void main(String... args) {
            String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
            String quoteToInsert = "always takes longer than";
            StringBuilder stringBuilder = new StringBuilder(quote);
            int index = quote.indexOf (" you");
            System.out.println(index);
            stringBuilder.insert(index, quoteToInsert);
            System.out.println(stringBuilder);


        }
    }
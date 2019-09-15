import java.util.stream.Stream;

public class practise8Censor {
    public static void main(String[] args) {
        String result = censor ("A kutya nagyon aranyos kutya","kutya","macska");
        System.out.println(result);
    }
    static String censor(String text, String toChange, String newWord) {
        text = text.replaceAll(toChange,newWord);
        return text;
    }
}


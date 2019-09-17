public class TodoPrint {
    public static void main(String... args){
        String beginning = "My todo:\n";
        String todoText = " - Buy milk\n";
        String todoText1 = "- DownLoad games\n";
        String todoText2 = "\t - Diabolo\n";

        todoText = beginning.concat(todoText).concat(todoText1).concat(todoText2);
        System.out.println(todoText);
    }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo


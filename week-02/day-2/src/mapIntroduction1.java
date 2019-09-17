import java.util.HashMap;

public class mapIntroduction1 {
    public static void main(String[] args) {
        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, String> map = new HashMap<>();

        //Print out whether the map is empty or not
        System.out.println(map.isEmpty());

        //Add the following key-value pairs to the map
        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");

        //Print all the keys
                               /* 1. megoldas:
                                 for (Integer key : map.keySet()) {

                                    System.out.println(key);
                                } */
        System.out.println(map.keySet());

        //Print all the values
        System.out.println(map.values());
                           /*   1.megoldas:
                                for (String value : map.values()) {
                                System.out.println(value); */
        //Add value D with the key 68
        map.put(68,"D");
        //Print how many key-value pairs are in the map
        System.out.println(map.size());
        //Print the value that is associated with key 99
        System.out.println(map.get(99));
        //Remove the key-value pair where with key 97
        map.remove(97);
        //Print whether there is an associated value with key 100 or not
        System.out.println(map.containsKey(100));
        //Remove all the key-value pairs
        map.clear();
        }
    }



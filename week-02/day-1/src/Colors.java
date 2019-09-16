// - Create a two dimensional array which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green: `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red: `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink: `"orchid", "violet", "pink", "hot pink"`

public class Colors {
    public static void main(String[] args) {
        String[][] colors = {
                // color [0]      0.          1.            2.         3.          4.
                              {"lime", "forest green", "olive", "pale green", "spring green"},
                // color [1]    0.              1.     2.
                              {"orange red", "red", "tomato"},
                //color [2]     0.         1.       2.       3.
                             {"orchid", "violet", "pink", "hot pink"}
        };
        //System.out.println(colors[row][column]); megoldas: red
        System.out.println(colors[1][1]);
    }
}


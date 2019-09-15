public class DrawDiagonal {

    public static void main(String[] args) {

        int numberOfLines = 5;

        for (int line = 0; line <= numberOfLines; line++) {

            for (int column = 0; column <= numberOfLines; column++) {
                //System.out.print("%");
                //    0.sor     0.oszlop        atlo feltele      utolso sor feltetele     utolso oszlop feltetele
                if (line == 0 || column == 0 || line == column || line == numberOfLines || column == numberOfLines) {
                    System.out.print("%");
                } else {
                    // uresen hagyja a helyeket!!
                    System.out.print(" ");
                }

                // sor vegere ertunk, uj sort kezd, kulonben egy sorba irna ki a % jeleket!
                if (column == numberOfLines) {
                    System.out.println();
                }
            }
        }
    }
}


// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//column==0
// v
// %%%%% ->line ==0
// %%  % ->column == numberOfLines
// % % %
// %  %% \->Diagonal: column==line
// %%%%% ->line == numberOfLines
//
// The square should have as many lines as the number was
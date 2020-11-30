import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        ArrayList<Integer> temp = new ArrayList<>();
        int closestNumber;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            System.err.print(t + " ");
            temp.add(t);
        }

        if (temp.size() == 0) {
            closestNumber = 0;
        }
        else {
            closestNumber = temp.get(0);

            for (int i = 0; i < temp.size(); i++) {


                if (Math.abs(temp.get(i)) < Math.abs(closestNumber) && i != 0) {
                    closestNumber = temp.get(i);
                }
                if (temp.get(i) == Math.abs(closestNumber) && i != 0) {
                    closestNumber = Math.abs(temp.get(i));
                }

            }
        }



        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closestNumber);
    }
}
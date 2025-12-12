import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**Side project of finding the maximum number of the given numbers by user
 * Nhlanhla Maluleke
 * 2025/12/10
 */

// Change class name to reflect new functionality
public class NumberAnalyzer {  // Was: MaxNumberFinder
    static ArrayList<Integer> list;
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to put in?");
        int k = input.nextInt();
        int idx = 0; 
        list = new ArrayList<Integer>();
       do {
            System.out.println("Enter the number "+(idx+1)+":");
            int i = input.nextInt();
            list.add(i);
            idx++;
        }while(k>idx);
        System.out.println("Maximum number: "+findMax(list));
        System.out.println("Minimum number: "+findMinimum(list));
        System.out.println("Average number: "+findAverage(list));
        input.close();
        
    }
    //The method that calculates the maximum number between any given numbers
    public static int findMax(ArrayList<Integer> list){
        //Add an exception so that the programme does not crash
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
         return Collections.max(list); // Built-in Java method

    }

    // NEW: Add minimum finder
    public static int findMinimum(ArrayList<Integer> list) {
        return Collections.min(list);
    }
    
    // NEW: Add middle/average finder  
    public static double findAverage(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

}


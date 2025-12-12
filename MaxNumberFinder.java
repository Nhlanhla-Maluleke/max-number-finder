import java.util.ArrayList;
import java.util.Scanner;

/**Side project of finding the maximum number of the given numbers by user
 * Nhlanhla Maluleke
 * 2025/12/10
 */
public class MaxNumberFinder {
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
        System.out.println("Maximum number: "+max(list));
        
    }
//The method that calculates the maximum number between any given numbers
    static int max(ArrayList<Integer> list){
        //Add an exception so that the programme does not crash
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        int maxValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
          if(list.get(i)>maxValue){
            maxValue = list.get(i);
          }
        }
        return maxValue;

    }

}


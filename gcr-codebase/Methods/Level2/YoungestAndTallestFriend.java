// Java program to find the youngest and tallest among three friends.
import java.util.Scanner;

public class YoungestAndTallestFriend {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages){
        int minAge = ages[0];
        int index = 0;
        for(int i = 1; i < ages.length; i++){
            if(ages[i] < minAge){
                minAge = ages[i];
                index = i;
            }
        }
        if(index == 0) return "Amar";
        else if(index == 1) return "Akbar";
        else return "Anthony";
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights){
        double maxHeight = heights[0];
        int index = 0;
        for(int i = 1; i < heights.length; i++){
            if(heights[i] > maxHeight){
                maxHeight = heights[i];
                index = i;
            }
        }
        if(index == 0) return "Amar";
        else if(index == 1) return "Akbar";
        else return "Anthony";
    }

    // Main method
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        for(int i = 0; i < 3; i++){
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }
        System.out.println("Youngest friend is " + findYoungest(ages));
        System.out.println("Tallest friend is " + findTallest(heights));

        sc.close();
    }
}

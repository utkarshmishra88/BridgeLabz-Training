// Java program to generate 4-digit random numbers and find their average, minimum and maximum.

public class RandomNumberStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, minimum and maximum of an array
    public static double[] findAverageMinMax(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    // Main method
    public static void main(String args[]){

        int[] numbers = generate4DigitRandomArray(5);
        for(int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
        double[] result = findAverageMinMax(numbers);
        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + result[1]);
        System.out.println("Maximum = " + result[2]);
    }
}

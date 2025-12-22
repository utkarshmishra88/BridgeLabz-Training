//Java program to demonstrate NullPointerException. 
public class NullPointerDemo {

    // Method to generate NullPointerException
    static void generateException() {
        String text = null;        
        System.out.println(text.length()); 
    }

    // Method to handle NullPointerException
    static void handleException() {
        String text = null; // variable initialized to null
        try {
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully");
            System.out.println("Reason: Object reference is null");
        }
    }

    //Main method
    public static void main(String[] args) {

        // generate exception
        System.out.println("Generating Exception:");
        generateException();

        // handle the exception
        System.out.println("\nHandling Exception:");
        handleException();
    }
}

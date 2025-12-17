import java.util.Scanner;

// Calculate Area of Triangle
public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base, height; // declare base and height

        System.out.print("Enter base of triangle (in inches): ");
        base = input.nextDouble(); // take base from user

        System.out.print("Enter height of triangle (in inches): ");
        height = input.nextDouble(); // take height from user

        double areaSquareInches = 0.5 * base * height; // area in square inches
        double areaSquareCm = areaSquareInches * 6.4516; // convert to square centimeters

        System.out.println(
            "The area of the triangle is " + areaSquareInches + " sq in and "
            + areaSquareCm + " sq cm"
        );
    }
}

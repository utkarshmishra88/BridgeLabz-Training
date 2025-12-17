// Program to divide pens equally among students and find remaining pens
public class DividePens
{  
    public static void main(String[] args)
    {
        //declare and initialize variables
        int totalPens = 14;
        int students = 3;
        
        int pensPerStudent = totalPens / students; //calculating pens per student
        int remainingPens = totalPens % students;  //calculating remaining pens
        
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens); //Display the result
    }
}

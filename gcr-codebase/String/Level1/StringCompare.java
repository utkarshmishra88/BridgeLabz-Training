//Java program to compare two strings.
import java.util.Scanner;

public class StringCompare{
 
    //compare two strings using charAt method
    public static boolean compareUsingcharAt(String s1,String s2){
	
		//first compare length
		if(s1.length()!=s2.length()){
		    return false;
		}

        //compare character using charAt
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }

        //if all character matches then 
        return true;
    }		

    //Main method
    public static void main(String args[]){
	    
		//Creating Scanner object and take input from the user.
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter first string : ");
		String s1=input.next();
		System.out.println("Enter second string : ");
		String s2=input.next();
		
	    boolean charAtResult=compareUsingcharAt(s1,s2);
		
		boolean equalsResult=s1.equals(s2);
		
		System.out.println("\nResult using charAt() method: " + charAtResult);
        System.out.println("Result using equals() method: " + equalsResult);
		
		if(charAtResult==equalsResult)
		    System.out.println("Both results are same");
		else
		    System.out.println("Both results are not same");
			
		input.close();
    }
}	
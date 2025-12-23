//Java program to count vowels and consonants.
import java.util.Scanner;

public class VowelsConsonants{
    
	static int countVowels(String s){
	    int count=0;
		for(int i=0;i<s.length()-1;i++){
		    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
			count++;
		}	
	}
	return count;
	}

    static int countConsonants(String s){
	    int count=0;
		for(int i=0;i<s.length()-1;i++){
		    if(s.charAt(i)!='a'||s.charAt(i)!='e'||s.charAt(i)!='i'||s.charAt(i)!='o'||s.charAt(i)!='u'){
			count++;
		}	
	}
	return count;
	}
	
	//Main method
    public static void main(String args[]){
	    
		//Creating Scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String str=sc.next().toLowerCase();
		
		int countVowel=countVowels(str);
		int countConsonant=countConsonants(str);
		
		System.out.println("Total Vowels : "+countVowel);
		System.out.println("Total Consonants : "+countConsonant);
		
		//Closing scanner stream
		sc.close();
	}
}	
		
		
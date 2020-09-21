import java.util.*;
/*
 * Implement a program 
 * which is taking int n (n between 0 and 9) 
 * as a parameter and return value in letter
 */
public class Hashmap {
	static String ReturnLetter(int n) {
		HashMap<Integer, String> LetterN = new HashMap<Integer, String>();
		//addin elements
		LetterN.put(0,"Zero");
		LetterN.put(1,"one");
		LetterN.put(2,"two");
		LetterN.put(3,"three");
		LetterN.put(4,"four");
		LetterN.put(5,"five");
		LetterN.put(6,"six");
		LetterN.put(7,"seven");
		LetterN.put(8,"eight");
		LetterN.put(9,"nine");
		if(n>=0 && n<=9) {
			String res= LetterN.get(n);
			return " is "+res;
		}else {
			return "Does not exist";
		}
			
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter an integer: ");
    	int number = input.nextInt();
    	String letter = ReturnLetter(number);
    	System.out.println("You entered " + number + " and the letter "+letter);
    	
	}

}

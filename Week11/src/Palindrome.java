
public class Palindrome {
	/*
	 * A palindrome is a word, phrase, number,
	 *  or other sequence of characters which reads 
	 *  the same backward or forward.(Wikipedia)
		Given a string , print Yes if it is a palindrome, 
		print No otherwise.
	 */
	public static boolean palid(String arg) {
		int first = 0;
		int last = arg.length()-1;
		boolean isPal=true;
		while(first < last) {
			String FirstLet = arg.substring(first,first+1);
			String LastLet = arg.substring(last,last+1);
			if(FirstLet.equalsIgnoreCase(LastLet)==false){
				isPal =false;
			}
		first++;
		last--;
		}
		return isPal;
		
	}
	public static String reserveWord(String str) {
		String[] words  =  str.split(" ");
		String StringReverse= "";
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			String WordRevers="";
			for(int j=word.length()-1; j>=0;j--) {
				WordRevers +=word.charAt(j);
			}
			StringReverse +=WordRevers;
			
		}
		return StringReverse;
	}
	public static boolean pali1(String word, String reverse) {
		if(word.equals(reverse)) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//some test case ["level",Racecar]
		String test ="madam ";
		/*boolean result = palid(test);
		if(result == false) {
			System.out.println(test + " is not a palindrome");
		}else {
			System.out.println(test + " is  a palindrome");
		}*/
		
		String reverse = reserveWord(test.trim());
		boolean result = pali1(test.trim(),reverse);
		if(result == false) {
			System.out.println(test +" 's reverse is  :" + reverse+ " is not a palindrome");
		}else {
			System.out.println(test +" 's reverse is  :" + reverse+  " is  a palindrome");
		}
		
		
	}

}

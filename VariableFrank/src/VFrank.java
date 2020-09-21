public class VFrank {
	
	
	public static void main(String[] args) {
		int val1 =200;
		int val2=35;
		System.out.println("val1 + val2: " + (val1 + val2) );
	      System.out.println("val1 - val2: " + (val1 - val2) );
	      System.out.println("val1 * val2: " + (val1 * val2) ); 
	      System.out.println("val1 / val2: " + (val1 / val2) );
	      System.out.println("val1 % val2: " + (val1 % val2) );
	      /*
	       * Assignments operators
	       */
	      
	      System.out.println("val2 = val1: " + (val2 = val1) );
	      System.out.println("val2 += val1: " + (val2 += val1) ); 
	      System.out.println("val2 -= val1: " + (val2 -= val1) );
	      System.out.println("val2 *= val1: " + (val2 *= val1) );
	      System.out.println("val2 /= val1: " + (val2 /= val1) );
	      System.out.println("val2 %= val1: " + (val2 %= val1) );
	      /*
	       * Auto-increment
	       */
	      int valI=10;
	      int valI2=30;
	      valI++;
	      valI2--;
	      System.out.println("valI++ : " +valI );
	      System.out.println("valI2-- : " +valI2 );
	      /*
	       * Logical Operators
	       */
	      boolean bool1=false;
	      boolean bool2=true;
	      
	      System.out.println("bool1 && bool2 : " +(bool1 && bool2) );
	      System.out.println("bool1 || bool2 : " + ( bool1 || bool2) );
	      System.out.println("!(bool1 && bool2) : " + !(bool1 && bool2) );
	      
	      /*
	       * Bitwise Operators
	       */
	      int bit1= 29;
	      int bit2= 31;
	      int rest= bit1 & bit2;
	      System.out.println("bit1 & bit2 : " +rest);
	      rest= bit1 | bit2;
	      System.out.println("bit1 | bit2 : " + rest );
	      rest= bit1 ^ bit2;
	      System.out.println("bit1 ^ bit2 : " + rest );
	      rest= ~bit1;
	      System.out.println("~bit1 : " + rest );
	      rest= bit1<<2;
	      System.out.println("bit1<<2 : " + rest );
	      rest= bit1>>2;
	      System.out.println("bit1>>2 : " + rest );
	      
	      /*
	       * Ternary Operator
	       */
	      boolean tern1=false;
	      boolean  result;
	      result = (tern1 == true) ? false : true;
	      System.out.println( "result : "+ result);
	      
	}
}


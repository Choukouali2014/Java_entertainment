import java.util.ArrayList;

public class ArrayL {
	  /*
	 * Create ArrayList of integer, 
	 * add 5 integers to the array and write 
	 * en method t return the minimum element of that array
	 */
	
	
	static int getMin(ArrayList<Integer> number) {
		int min= number.get(0);
		for (int i = 1; i < number.size(); i++) { 
			
			if(number.get(i) < min){
				min = number.get(i);
				} 		
	      }
		 return min;
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> listNumber = new ArrayList<Integer>();
		listNumber.add(263);
		listNumber.add(10);
		listNumber.add(17);
		listNumber.add(2);
		listNumber.add(27);
		int result = getMin(listNumber);
		System.out.println("the minimum is : "+result );
	}

}

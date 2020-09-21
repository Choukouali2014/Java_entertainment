
import java.util.LinkedList;

public class Linked {

	static int getMax(LinkedList<Integer> number) {
		int min= number.getFirst();
		for (int i = 1; i < number.size(); i++) { 
			
			if(number.get(i) > min){
				min = number.get(i);
				} 		
	      }
		 return min;
	}
	public static void main(String args[]) {
		int result;
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
			linkedlist.add(25);
	       linkedlist.add(20);
	       linkedlist.add(2);
	       linkedlist.add(06);
	       linkedlist.add(100);
	       result = getMax(linkedlist);
			System.out.println("the max is : "+result );
			linkedlist.remove(4);
			result = getMax(linkedlist);
			System.out.println("the max is after remove  : "+result );
			
	}
}

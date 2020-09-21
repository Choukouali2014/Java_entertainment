	/*
	 *  write a function in Java that take three numbers (int) and print the greatest number
	 */
public class IfFrank {

	/*public static void greaTest(int numb1,int numb2,int numb3) {
		if(numb1 >= numb2 && numb1>=numb3) {
			System.out.println("The greatest number is : "+numb1);
		}
		else if (numb2 >= numb1 && numb2>=numb3) {
			System.out.println("The greatest number is : "+numb2);
		}else {
			System.out.println("The greatest number is : "+numb3);
		}
		
	}*/
	public static void greaTest(int numb1,int numb2,int numb3) {
		int keep;
		if(numb1 > numb2) {
			keep = numb1;
		}else {
			keep = numb2;
			
		}
		
		
		if(keep <numb3) {
			keep=numb3;
		}
		System.out.println("The greatest number is : "+keep);
	}
	public static void main(String[] args) {
		int val1=9;
		int val2=11;
		int val3=5;
		greaTest(val1,val2,val3);
	}
}

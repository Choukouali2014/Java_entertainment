package week5;

public class Week6 {
	/*
	 * First switch case
	 */
	
	public  static void Switchcase(int a, int b) {
		int c = a+b;
		
		
		switch(c) {
			case 1:
				System.out.println("Case 1");
				break;
			case 2: 
				System.out.println("Case 2");
				break;
			case 3:
				System.out.println("Case 3");
				break;
			case 4: 
				System.out.println("Case 4");
				break;
			case 5:
				System.out.println("Case 5");
				break;
			default: 
				System.out.println("Default");
		
		}
		
	}
	public static int[] SortJava() {
		
		int tab[] = {10,25,1,0,8,11,14};
		for(int i=0; i<tab.length;i++) {
			for(int j=i+1;j<tab.length;j++) {
				if(tab[i]>tab[j]) {
					int temp = tab[j];
					tab[j]=tab[i];
					tab[i]=temp;
				}
			}
			
		}
		return tab;
	}
	public static   int Factoriel(int number) {
		/*
		 * Factoriel
		 * 4! = 1*2*3*4
		 * 1! =1
		 */
		int fact =1;
		int i=1;
		while(i<=number) {
			fact = fact*i;
			i++;
		}
		return fact;
	}
	public static void DoWhile() {
		int i = 4;
		do {
			System.out.println(i);
			i++;
		}while(i< 4);
	}
	public static void While() {
		int i = 4;
		while(i< 4) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		int fa=3;
		int a =1; int b=3;
		int[] c = SortJava();
		 System.out.println("--------Switch-------- ");
		
		 Switchcase(a,b);
		System.out.println("--------For-------- ");
		for(int i=0; i<c.length; i++) {
			 System.out.println(c[i]+" ");
		}
		int facts = Factoriel(fa);
		System.out.println("Factoriel is : "+facts);
		System.out.println("--------DoWhile-------- ");
		DoWhile();
		System.out.println("--------While-------- ");
		While();
		
	}
}

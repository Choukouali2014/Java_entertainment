 enum Days{
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday,
	Sunday
	
}
public class Day {
	public static void main(String[] args) {
    	for (Days days : Days.values()) {
    	    System.out.println(days);
    	}
    }
	
}

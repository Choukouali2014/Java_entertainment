package inter;

public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicycle = new Bicycle();
		bicycle.chaneGear(2);
		bicycle.seepUp(4);
		bicycle.applyBrakes(2);
		bicycle.printState();
		
		
		Bike bike = new Bike();
		bike.chaneGear(3);
		bike.seepUp(5);
		bike.applyBrakes(1);
		bike.printState();
		
	}

}

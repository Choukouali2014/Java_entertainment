package inter;

public class Bicycle implements Vehicule {
	int gear;
	int speed;
	public void chaneGear(int a) {
		gear = a;
		
	}

	public void seepUp(int b) {
		speed += b;
	}

	public void applyBrakes(int c) {
		speed -=c;
		
	}
	public void printState() {
		System.out.println("State for Bicycle speed: "+ speed + " gear : "+gear);
	}

}

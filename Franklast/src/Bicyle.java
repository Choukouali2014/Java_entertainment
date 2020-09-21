public class Bicyle {
	int gear;
	int speed;
	Bicyle(int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBrake (int decrement) {
		if(decrement>0 && speed >0 && speed >=decrement ) {
			speed =speed - decrement;
		}else {
			System.out.println("The speed cannot be negative");
		}
		
	}
	public void speedUp(int increment) {
		speed =speed + increment;
	}

}
 

  class MountainBike extends Bicyle{
	  int seatHeight;
	 Owner owner;
	MountainBike(int gear, int speed,Owner owner)
	{
		super(gear, speed);
		this.owner = owner;
	}
	public void setHeight(int val) {
		this.seatHeight = val;
	}
	
	
}
 
 

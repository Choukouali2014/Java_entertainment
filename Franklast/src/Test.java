
public class Test {

	public static void main(String[] args) {
		Owner ow = new Owner("Frank",21);
		MountainBike mountaiBike = new MountainBike(27,10,ow);
		mountaiBike.setHeight(5);
		System.out.println("The Owner is "+mountaiBike.owner.name+ " and the age is "+mountaiBike.owner.age);
		System.out.println("the gear is :"+mountaiBike.gear);
		System.out.println("the speed is :"+mountaiBike.speed);
		mountaiBike.applyBrake(13);
		mountaiBike.applyBrake(2);
		System.out.println("the speed after break is :"+mountaiBike.speed);
		mountaiBike.speedUp(1);
		System.out.println("the speed after speed up is :"+ mountaiBike.speed);

	}

}

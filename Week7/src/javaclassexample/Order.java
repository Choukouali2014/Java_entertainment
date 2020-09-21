package javaclassexample;
import week7.Product;
public class Order {
	public static void main (String args[]) {
		Product obj1 = new Product();
		Product obj2 = new Product();
		obj1.setName("Haricot");
		obj1.setPrice(30);
		obj1.setQty(2);
		
		obj2.setName("Patata");
		obj2.setPrice(100);
		obj2.setQty(20);
		System.out.println("name : "+obj1.getName()+" Quantity "+obj1.getQty()+" initial price :$ "+ obj1.getPrice() +"  Total price is : $"+obj1.totalPrice(obj1));
		System.out.println("name : "+obj2.getName()+" Quantity "+obj2.getQty()+" initial price :$ "+ obj1.getPrice() +" Total price is : $"+obj2.totalPrice(obj2));
		
	}
}

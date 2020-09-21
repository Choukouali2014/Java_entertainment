package week7;
/*
 * Create a class Product under 
 * week7 packages which has fields String name, 
 * double price, and int quantity. 
 * It also has method
 *  totalprice(int qty, double price)
 *   which return the total price of the order of that product.
 */
public class Product {
	
	private String name;
	private double price;
	private int quantity;
	public Product(){}
	
	public double totalPrice(Product pdt) {
		double result = pdt.getQty()*pdt.getPrice();
		return result;
	}
	public void setPrice(double num) {
        this.price = num;
    }
	public void setQty(int num) {
        this.quantity = num;
    }
	public void setName(String name) {
        this.name =name ;
    }
	
	//Getter
	public double getPrice() {
        return this.price;
    }
	public int getQty() {
      return  this.quantity ;
    }
	public String getName() {
      return this.name;
    }
	
	

}

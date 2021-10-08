package entides;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
			this.quantity += quantity;
	}
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
}
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
	}
		}
	

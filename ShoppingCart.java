/* Create a Product class to manage shopping cart items with the following features:
Static:
○       A static variable discount shared by all products.
○       A static method updateDiscount() to modify the discount percentage.
This:
○       Use this to initialize productName, price, and quantity in the constructor.
Final:
○       Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
○       Validate whether an object is an instance of the Product class before processing its details.
*/
class Product {
	static double discount = 5.0;
	final int productID;
	String productName;
	double price;
	int quantity;

	public Product(int productID, String productName, double price, int quantity) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public void displayProductDetails() {
		if (this instanceof Product) {
			System.out.println("Product ID: " + productID);
			System.out.println("Name: " + productName);
			System.out.println("Price: " + price);
			System.out.println("Quantity: " + quantity);
			System.out.println("Discount: " + discount );
		}
	}

	public static void updateDiscount(double newDiscount) {
		discount = newDiscount;
	}

	public static void main(String[] args) {
		Product prod1 = new Product(101, "iphone", 70000, 2);
		Product prod2 = new Product(102, "head phone", 1000, 3);
		prod1.displayProductDetails();
		prod2.displayProductDetails();
		Product.updateDiscount(10);
		System.out.println("New Discount Updated!");
	}
}
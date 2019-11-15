package Domain;



public class Product {
	protected int id;
	protected static int nextId = 1;
	protected String name; 
	protected double price;
	
	public Product(double price) {
		id = nextId;
		nextId++;
		this.price = price;
	}
	
	public String getId() {
		return "ID: "+this.id;
	}
	
	public String getName() {
		return "Name: "+ this.name;
	}
	
	public String getPrice() {
		return "Price: "+ this.price;
	}
	
	
	
}

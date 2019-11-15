package Domain;

public class Flower extends Product {
	protected String color;
	
	public Flower(String color,double price) {
		super(price);
		this.color = color;
	}
	
	public void setNameProduct() { 
		this.name = "Flower";
	}
	
	
	public String getColor() {
		return "color: "+ this.color;
	}
	
}

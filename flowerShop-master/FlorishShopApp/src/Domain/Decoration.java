package Domain;

public class Decoration extends Product {
	private String material;
	
	public Decoration (String material, double price) {
		super(price);
		this.material = material;
	}
	
	public void setNameProduct() {
		this.name = "Decoration"; 
	}
	
	public String getMaterial() {
		return "Decoration Material: "+this.material;
	}
}

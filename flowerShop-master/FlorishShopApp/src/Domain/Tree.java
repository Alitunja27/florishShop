package Domain;

public class Tree extends Product {
	private double height;
	
	public Tree(double height,double price ) {
		super(price);
		this.height = height;
	}
	
	public void setNameProduct() { 
		this.name = "Tree";
	}
	
	public String getHeight() {
		return "Tree height: "+this.height;
	}
}

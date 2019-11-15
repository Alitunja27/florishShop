package Application;

import Domain.Decoration;
import Domain.Flower;
import Domain.Tree;
import Persistance.StockRepository;


public class ShopController {
	
	private StockRepository stock;
	private String shopName;
	
	public ShopController(String shopName) {
		this.shopName = shopName;
		stock = new  StockRepository();
	}
	
	//instantiating flower calss 
	public void addFlower(String color, double price) {
		Flower newFlower = new Flower(color, price);	
		newFlower.setNameProduct();//set name of the object
		stock.addFlowerToList(newFlower);
	}
	
	//instantiating tree calss
	public void addTree(double height, double price) {
		Tree newTree = new Tree(height, price);	
		newTree.setNameProduct();//set name of the object
		stock.addTreeToList(newTree);
	}
	//instantiating decoration calss
	public void addDecoration(String material, double price) {
		Decoration newDecoration = new Decoration(material, price);	
		newDecoration.setNameProduct();//set name of the object
		stock.addDecorationToList(newDecoration);
	}
	
	public String getList() {
		String currentStock =this.shopName +" Current Stock availability: "+((stock.getAllFlowers().size())+(stock.getAllTrees().size())+(stock.getAllDecorations().size()))+" products"+"\n";
		String flowers = stock.getAllFlowers().size()+" Flowers available in Stock"+"\n";
		String trees = stock.getAllTrees().size()+ " Trees available in Stock "+"\n";
		String decorations =  stock.getAllDecorations().size()+ " Decorations available in Stock "+"\n";
		
	
		for (int i = 0; i < stock.getAllFlowers().size(); i++) {
			flowers += stock.getAllFlowers().get(i).getId()+", "
				  +stock.getAllFlowers().get(i).getName()+", "
				  +stock.getAllFlowers().get(i).getPrice()+"€, "
				  +stock.getAllFlowers().get(i).getColor()+"\n";
			}
		
		for (int i = 0; i < stock.getAllTrees().size(); i++) {
			trees +=stock.getAllTrees().get(i).getId()+", "
				  +stock.getAllTrees().get(i).getName()+", "
				  +stock.getAllTrees().get(i).getPrice()+"€, "
				  +stock.getAllTrees().get(i).getHeight()+"\n";
			}
		
		for (int i = 0; i < stock.getAllDecorations().size(); i++) {
			decorations +=stock.getAllDecorations().get(i).getId()+", "
				  +stock.getAllDecorations().get(i).getName()+", "
				  +stock.getAllDecorations().get(i).getPrice()+"€, "
				  +stock.getAllDecorations().get(i).getMaterial()+"\n";
			}
		
		String stockProducts = currentStock +"\n" +flowers + "\n" +trees+"\n"+decorations; 
		return stockProducts;
	}
	
	


}

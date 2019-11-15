package View;

import Application.ShopController;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShopController flowerShop = new ShopController("Los Venezolanos");
		
		flowerShop.addFlower("blue", 20);
		
		flowerShop.addDecoration("wood", 1000);
		
		flowerShop.addDecoration("Plastic", 800);
		
		flowerShop.addTree(1.85, 20);
		
		flowerShop.addTree(1.60, 15.60);
		
		flowerShop.addDecoration("wood", 1500);
		
		flowerShop.addFlower("red", 10);
		
		System.out.println(flowerShop.getList());

	}

}

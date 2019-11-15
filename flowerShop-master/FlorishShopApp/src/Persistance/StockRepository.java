package Persistance;

import java.util.ArrayList;

import Domain.Decoration;
import Domain.Flower;
import Domain.Product;
import Domain.Tree;

public class StockRepository {

	protected ArrayList<Flower> flowers = new ArrayList<Flower>();
	protected ArrayList<Tree> trees = new ArrayList<Tree>();
	protected ArrayList<Decoration> decorations = new ArrayList<Decoration>();
	protected ArrayList<Product> finalStock = new ArrayList<>();
	
	public StockRepository() {}
	
	public void addFlowerToList(Flower flower) {
		this.flowers.add(flower);
	}
	
	public void addTreeToList(Tree tree) {
		this.trees.add(tree);
	}
	
	public void addDecorationToList(Decoration decoration) {
		this.decorations.add(decoration);
	}
	
	public ArrayList<Flower> getAllFlowers(){
		return new ArrayList<>(flowers); 
	}
	
	public ArrayList<Tree> getAllTrees(){
		return new ArrayList<>(trees); 
	}
	
	public ArrayList<Decoration> getAllDecorations(){
		return new ArrayList<>(decorations); 
	}

}



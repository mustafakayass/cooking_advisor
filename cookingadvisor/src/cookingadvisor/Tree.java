package cookingadvisor;

import java.util.ArrayList;


public class Tree {
	
private TreeNode root;

public Tree(TreeNode root) {
	this.root = root;
}

public boolean isEmpty() {
	return root==null;
}

public void addNode(TreeNode node) {
	
	if(!isEmpty()) { // if tree is not empty
		int key = node.getKey();
		int currentKey;
		
		TreeNode parent = null;
		TreeNode current = root;
		
		while(current!=null) {
			currentKey = current.getKey();
			if(key>currentKey) {
				parent = current;
				current = current.getRight();
			}
			if(key<currentKey) {
				parent = current;
				current = current.getLeft();
			}
			if(key==currentKey) {
				parent = current;
				current = current.getRight();
			}
		}
		
		currentKey = parent.getKey();
		if(key>currentKey)
			parent.setRight(node);
		if(key<currentKey)
			parent.setLeft(node);
		if(key==currentKey)
			parent.setRight(node);
		
	}else // if tree is empty
		root = node;
}

public void printData(TreeNode node) {
	if(isEmpty())
		System.out.println("Tree is empty.");
	else {
		if(node==null)
			return;
		
		printData(node.getLeft());
		
		System.out.println(node.getFood().getName());
		
		printData(node.getRight());
	}
	
}
public void giveAdvice(ArrayList<String> materials) {
	ArrayList<Food> matches = new ArrayList<Food>(); //creating an ArrayList to keep matching foods.
	int key = materials.size(); // Since we are looking for material numbers, we should keep it.
	int currentKey;
	TreeNode current = root;
	while(current!=null) {
		currentKey = current.getKey();
		if(currentKey==key) { // if the number of materials match, add that food the the collection.
			matches.add(current.getFood());
			current = current.getRight();
		}
			
		if(key>currentKey)
			current = current.getRight();
		if(key<currentKey)
			current = current.getLeft();
	}
	int count = 0;
	for (int i = 0; i < matches.size(); i++) {
		boolean doesContain = materials.containsAll(matches.get(i).getMaterials()); //checks given materials match with any recipe materials
		if(doesContain) {
			System.out.println("Matching recipe:\n" + matches.get(i).getName()+"\n"+matches.get(i).getRecipe()); // if it matches, print the name of the food and recipe
			count++;
		}
			
	}
	if(count==0)
		System.out.println("No matching recipe, sorry. :(");
}
}

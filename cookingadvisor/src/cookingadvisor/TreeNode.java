package cookingadvisor;

public class TreeNode {
private int key;
private Food food;
private TreeNode left;
private TreeNode right;

public TreeNode(Food food) {
	key = food.getNumOfMaterials();
	this.food = food;
	left = null;
	right = null;
}

public int getKey() {
	return key;
}

public Food getFood() {
	return food;
}

public TreeNode getLeft() {
	return left;
}

public void setLeft(TreeNode left) {
	this.left = left;
}

public TreeNode getRight() {
	return right;
}

public void setRight(TreeNode right) {
	this.right = right;
}

}

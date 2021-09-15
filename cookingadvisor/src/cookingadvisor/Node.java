package cookingadvisor;

public class Node {
Node next;

private Food food;

public Node(Food food) {
	this.food = food;
}

public Food getFood() {
	return food;
}
}

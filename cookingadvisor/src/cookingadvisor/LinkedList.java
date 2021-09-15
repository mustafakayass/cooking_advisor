package cookingadvisor;

public class LinkedList {
private Node root;

public LinkedList() {
	this.root = new Node(null);
}
public boolean isEmpty() {
	return root.next==null;
}
public void addFood(Food food) {
	if(root==null) {
		Node newNode = new Node(food);
		root.next=newNode;
		}else {
			Node current = root;
			while(current.next!=null) {
				current = current.next;
			}
			Node newNode = new Node(food);
			current.next = newNode;
			
		}
}
public void printData() {
	if(root!=null) {
		Node current = root;
		int count = 1;
		if(!isEmpty()) {
			while(current.next!=null) {
				current = current.next;
				System.out.println(count + "-" +current.getFood().getName());
				count++;
			}
		}else 
			System.out.println("The list is empty.");
	}
}
}

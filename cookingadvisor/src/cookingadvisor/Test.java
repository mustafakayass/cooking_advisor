package cookingadvisor;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static ArrayList<String> listOfMaterials = new ArrayList<String>();
public static void main(String[] args) {
	
	System.out.println("Welcome to Cooking Advisor! Please choose an option.");
	
	Database.getTheData();

	int answer;
	boolean exit = false;
	Scanner sc = new Scanner(System.in);
	while(!exit) {
		
		
		System.out.println("1-Get an advice, 2-Get the food list, 3-Add a recipe, 4- Exit.");
		while(true) {
			
			answer = sc.nextInt();
			if(answer>0 && answer<5) {			
				break;
			}else {
				System.out.println("Given number must be in range of 1-4. Please choose again.");
			}
			
		}
		
		switch (answer) {
		case 1:
			System.out.println("Which materials do you have? Type '-1' in the end.");
			ArrayList<String> userMaterials = new ArrayList<String>();
			
			for (int i = 0; i < listOfMaterials.size(); i++) {
				int count = i+1;
				System.out.print(count+"-"+listOfMaterials.get(i)+" ");
				if(i!=0 && i%10==0)
					System.out.println();
			}
			System.out.println();
			Scanner s = new Scanner(System.in);
			int index;
			while(true) {
				System.out.print("Choose a material:");
				index = s.nextInt()-1; 																// Since we are working with indexes, we need -1 of selection.
				if(index>=0 && index<=listOfMaterials.size()) {
					if(!userMaterials.contains(listOfMaterials.get(index))) { 						//checking the list contains the chosen material or not.
						userMaterials.add(listOfMaterials.get(index)); 								//adding chosen material to the userMaterials collection.
						System.out.println(listOfMaterials.get(index) + " has been added."); 		// reporting which material have been added.
					}else
						System.out.println("You have already added that material to the list.");
					
				}	else if(index+1==-1)
						break;
					else
						System.out.println("Its not a valid number. Please choose again.");
				
			}
			Database.tree.giveAdvice(userMaterials); // calling search method for matching recipes.
			break;
		case 2:
			System.out.println("The list:");
			Database.linkedlist.printData();
			System.out.println("Please choose a new action.");
			break;
		case 3:
			Database.linkedlist.addFood(addRecipe()); //Adding the new recipe to the linked list.
			Database.tree.addNode(new TreeNode(addRecipe())); //Adding the new recipe to the tree.
			System.out.println("Recipe added successfully.");
			break;
		case 4:
			System.out.println("Thanks for using Cooking Advisor, bye!");
			sc.close();
			exit = true;
			break;
		}
		
	}
	
	
}

public static Food addRecipe() {
	System.out.println("What is the name of cook?");
	@SuppressWarnings("resource") // We should close the scanner but if we do it, it closes all input stream.
	Scanner scn = new Scanner(System.in);
	String name = scn.nextLine();
	System.out.println("What is the recipe?");
	String recipe = scn.nextLine();
	System.out.println("What are the needed materials? (Type 'done' in the end.)");
	
	ArrayList<String> materials = new ArrayList<String>();
	int count = 1;
	while(true) {
		
		System.out.println(count+"-");
		String material = scn.nextLine();
		if(material.matches("done"))
			break;
		else {
		materials.add(material);
		listOfMaterials.add(material);
		}
		count++;
		
	}
	Food newFood = new Food(materials, name, recipe);
	return newFood;
}


}

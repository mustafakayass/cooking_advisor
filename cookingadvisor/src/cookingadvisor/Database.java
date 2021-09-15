package cookingadvisor;

import java.util.ArrayList;

public class Database {
	static TreeNode root;
	static Tree tree;
	static LinkedList linkedlist  = new LinkedList();
	
	public static void getTheData(){
		
		ArrayList<String> materials1 = new ArrayList<String>();
		materials1.add("Frozen kidney bean");
		materials1.add("Onion");
		materials1.add("Ground meat");
		materials1.add("Salt");
		materials1.add("Blackpepper");
		materials1.add("Cumin");
		Food food1 = new Food(materials1, "Ingredients For Quickie kidney bean with ground meat", "Cut half the onion and roast in a pressure cooker, adding very little oil. Add the chopped tomatoes and kidney beans and close the lid. Enjoy your meat.");
		root = new TreeNode(food1);
		tree = new Tree(root);
		linkedlist.addFood(food1);
		
		ArrayList<String> materials2 = new ArrayList<String>();
		materials2.add("Pepper");
		materials2.add("Cream");
		materials2.add("Milk");
		materials2.add("Oil");
		materials2.add("Salt");
		
		Food food2 = new Food(materials2, "Ingredients For Pepper with cream", "Wash and strain the pepper. Heat the oil in a pan and fry the peppers nicely.Take the paper towel into a bowl laid out.Mix the cream and milk nicely in a separate bowl and take the excess oil-drained peppers to a separate pan and pour the creamy milk mixture over top.Add the salt, then cook for about 5 minutes and serve hot. Enjoy your meal.");
		TreeNode node2 = new TreeNode(food2);
		tree.addNode(node2);
		linkedlist.addFood(food2);
		
		ArrayList<String> materials3 = new ArrayList<String>();
		materials3.add("Oil");
		materials3.add("Onion");
		materials3.add("Tomato paste");
		materials3.add("Chopped leek");
		materials3.add("Salt");
		materials3.add("Blackpepper");
		materials3.add("Water");
		
		Food food3 = new Food(materials3, "Ingredients For leek roasting", "Put the onion, oil and paste in the pan. Roast for a few minutes.Then add the chopped leeks.Mix well. Continue to roast, adding salt and pepper.Add the water and leave it to cook. When the leeks get soft and soft, remove from the heat.Your meal is ready to eat. You can serve it with garlic yogurt, butter and red pepper souce. Enjoy it.");
		TreeNode node3 = new TreeNode(food3);
		tree.addNode(node3);
		linkedlist.addFood(food3);
		
		ArrayList<String> materials4 = new ArrayList<String>();
		materials4.add("Oil");
		materials4.add("Flour");
		materials4.add("Lemon Juice");
		materials4.add("Chopped broccoli");
		materials4.add("Yogurt");
		
		Food food4 = new Food(materials4, "Ingredients For broccoli soup with yogurt","Roast the flour with oil until the odor disappears.Wash the broccoli, slice them small and add them to the pan and roast.After 5-6 minutes, add 400 milliliters of boiling water and stir.Once the broccoli is well softened, add the lemon juice.Mix the yogurt with hot water in a mixing bowl. Then add to the pan and stir. Bring the soup to a boil a little more, stirring.Once it boils, add salt and spices and stir. Your meal is ready. Enjoy your meal." );
		TreeNode node4 = new TreeNode(food4);
		tree.addNode(node4);
		linkedlist.addFood(food4);
		
		ArrayList<String> materials5 = new ArrayList<String>();
		materials5.add("Rice");
		materials5.add("Brocoli");
		materials5.add("Boiled Chicken Leg");
		materials5.add("Olive Oil");
		materials5.add("Salt");
		materials5.add("Water");
		
		Food food5 = new Food(materials5, "Ingredients For Chicken Rice Recipe With Broccoli", "Wash and strain the rice. Bring the water to a boil, add the salt and rice and cook over a low heat.\n"
				+ "Add the chopped broccoli, which is close to softening the rice, and cook for another 1-2 minutes, and then strain. Add boiled chicken pieces and olive oil and serve. Bon Appetit!");
		TreeNode node5 = new TreeNode(food5);
		tree.addNode(node5);
		linkedlist.addFood(food5);
		
		ArrayList<String> materials6 = new ArrayList<String>();
		materials6.add("Potatoes");
		materials6.add("Onion");
		materials6.add("Eggs");
		materials6.add("Salt");
		materials6.add("Pepper flakes");
		materials6.add("Red Powdered Pepper");
		materials6.add("Boil grass");
		
		Food food6 = new Food(materials6, "Ingredients For Macaroni Potato Patties Recipe", "Grate the potatoes and onion.1 teaspoon salt,add on top. Transfer the grates to a filter, under which you place a bowl. Crush it well.Allow the water to drain for 15 minutes. then take it into a bowl and add red powdered pepper, flakes of pepper and boil grass (or thyme) on them.Add the eggs.Mix well until all ingredients are intertwined.Heat the oil in the pan and take the meatball mixture into the pan with a spoon and fry well.Bon Appetit!");
		TreeNode node6 = new TreeNode(food6);
		tree.addNode(node6);
		linkedlist.addFood(food6);
		
		ArrayList<String> materials7 = new ArrayList<String>();
		materials7.add("Cauliflower");
		materials7.add("Salt");
		materials7.add("Black Pepper");
		materials7.add("Olive oil");
		materials7.add("Tulum cheese");
		
		Food food7 = new Food(materials7, "Ingredients For A Recipe For Cauliflower With Baked Cheese", "Slice the cauliflower.On a tray laid out in greaseproof paper, sauce all over with salt, pepper and olive oil.Bake the tray in the oven preheated at 200 degrees until golden brown.Serve with cheese grated on top as soon as the cauliflower comes out of the oven. Enjoy your meal.");
		TreeNode node7 = new TreeNode(food7);
		tree.addNode(node7);
		linkedlist.addFood(food7);
		
		ArrayList<String> materials8 = new ArrayList<String>();
		materials8.add("Potatoes");
		materials8.add("Olive Oil");
		materials8.add("Butter");
		materials8.add("Turmeric");
		materials8.add("Powdered paprika");
		materials8.add("Parsley");
		materials8.add("Salt");
		
		Food food8 = new Food(materials8,"Ingredients For Turmeric Potato Roasting Recipe", "Boil the potatoes.When your potatoes are very soft, take them from the stove. Peel them under cold water.Then chop into cubes.\r\n"
				+ "Take oil in a pan. When the oil melts, put the turmeric and powdered red pepper in it. Then add the chopped potatoes. Mix it.Fry until the potatoes turn color.Add the salt and remove from the stove. When he threw some heat, parsley, finely into small pieces and add. Then serve. Be sure to enjoy.");
		TreeNode node8 = new TreeNode(food8);
		tree.addNode(node8);
		linkedlist.addFood(food8);
		
		//for loops in order to add all materials to the materials list.
		for (int i = 0; i < materials1.size(); i++) {
			Test.listOfMaterials.add(materials1.get(i));
		}
		for (int i = 0; i < materials2.size(); i++) {
			if(!Test.listOfMaterials.contains(materials2.get(i))) //checking if the material already added or not. We don't want duplicates.
				Test.listOfMaterials.add(materials2.get(i));
		}
		for (int i = 0; i < materials3.size(); i++) {
			if(!Test.listOfMaterials.contains(materials3.get(i)))
				Test.listOfMaterials.add(materials3.get(i));
		}
		for (int i = 0; i < materials4.size(); i++) {
			if(!Test.listOfMaterials.contains(materials4.get(i)))
				Test.listOfMaterials.add(materials4.get(i));
		}
		
		for (int i = 0; i < materials5.size(); i++) {
			if(!Test.listOfMaterials.contains(materials5.get(i)))
				Test.listOfMaterials.add(materials5.get(i));
		}
		
		for (int i = 0; i < materials6.size(); i++) {
			if(!Test.listOfMaterials.contains(materials6.get(i)))
				Test.listOfMaterials.add(materials6.get(i));
		}
		for (int i = 0; i < materials7.size(); i++) {
			if(!Test.listOfMaterials.contains(materials7.get(i)))
				Test.listOfMaterials.add(materials7.get(i));
		}
		for (int i = 0; i < materials8.size(); i++) {
			if(!Test.listOfMaterials.contains(materials8.get(i)))
				Test.listOfMaterials.add(materials8.get(i));
		}
	}
}

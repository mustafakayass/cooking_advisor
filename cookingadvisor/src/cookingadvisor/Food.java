package cookingadvisor;

import java.util.ArrayList;

public class Food {

private int numOfMaterials;
private ArrayList<String> materials;
private String name;
private String recipe;

public Food(ArrayList<String> materials, String name, String recipe) {
	this.materials=materials;
	this.numOfMaterials = materials.size();
	this.name = name;
	this.recipe = recipe;
}

public int getNumOfMaterials() {
	return numOfMaterials;
}

public String getName() {
	return name;
}

public String getRecipe() {
	return recipe;
}


public ArrayList<String> getMaterials() {
	return materials;
}


}

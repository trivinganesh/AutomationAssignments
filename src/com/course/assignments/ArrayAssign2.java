package com.course.assignments;

public class ArrayAssign2 {

	public static void main(String[] args) {

		
		/*
			// Defining the number of array to store the values are stores in Single Dimensional Array	
			// Groceries are stored in seperate array	
			// Electronics are stored in seperate array		
			*/	
		String[][][] sprmrkt = new String[2][4][5];

		String[] sprmrkt1 = { "Groceries", "Electronics" };

		sprmrkt[0][0] = new String[] { "Cola", "Orange Juice", "Lemonade", "Green Tea", "Black Coffee" };
		sprmrkt[0][1] = new String[] { "Popcorn", "Trail Mix", "Beef Jerky", "Salted Nuts", "Rice Cakes" };
		sprmrkt[0][2] = new String[] { "Cottage Cheese", "Heavy Cream", "Ice Cream", "Parmesan Cheese", "Eggnog" };
		sprmrkt[0][3] = new String[] { "Apples", "Bananas", "Carrots", "Potatoes", "Onions" };

		sprmrkt[1][0] = new String[] { "Cola", "Orange Juice", "Lemonade", "Green Tea", "Black Coffee" };
		sprmrkt[1][1] = new String[] { "Popcorn", "Trail Mix", "Beef Jerky", "Salted Nuts", "Rice Cakes" };
		sprmrkt[1][2] = new String[] { "Cottage Cheese", "Heavy Cream", "Ice Cream", "Parmesan Cheese", "Eggnog" };
		sprmrkt[1][3] = new String[] { "Apples", "Bananas", "Carrots", "Potatoes", "Onions" };

		// System.out.println("The Groceries products of Snacks: " + sprmrkt[0][1][1]);
		
		
		
		/*
		// Defining the number of array to store the values are stores in Three Dimensional Array	
		// Groceries are stored in different array seperate indexes	
		// Electronics are stored in different array seperate indexes			
		*/
		

		String[][][] sprmkt = new String[2][4][5];

		// Adding the products list for Main Category 1 - Groceries
		// Groceries Main category 1 - Beverages

		sprmkt[0][0][0] = "Cola";
		sprmkt[0][0][1] = "Orange Juice";
		sprmkt[0][0][2] = "Lemonade";
		sprmkt[0][0][3] = "Green Tea";
		sprmkt[0][0][4] = "Black Coffee";

		// Groceries Main category 1 - Snacks

		sprmkt[0][1][0] = "Popcorn";
		sprmkt[0][1][1] = "Trail Mix";
		sprmkt[0][1][2] = "Beef Jerky";
		sprmkt[0][1][3] = "Salted Nuts";
		sprmkt[0][1][4] = "Rice Cakes";

		// Groceries Main category 1 - Dairy Products

		sprmkt[0][2][0] = "Cottage Cheese";
		sprmkt[0][2][1] = "Trail Mix";
		sprmkt[0][2][2] = "Heavy Cream";
		sprmkt[0][2][3] = "Ice Cream";
		sprmkt[0][2][4] = "Parmesan Cheese";

		// Groceries Main category 1 -Produce

		sprmkt[0][3][0] = "Apples";
		sprmkt[0][3][1] = "Bananas";
		sprmkt[0][3][2] = "Carrots";
		sprmkt[0][3][3] = "Potatoes";
		sprmkt[0][3][4] = "Onions";

		System.out.println("Groceries Main category 1 - Beverages:  " + sprmkt[0][0][0]);
		

		// Adding the products list for Main Category 2 - Electronics
		// Electronics Main category 1 - Beverages

		sprmkt[1][0][0] = "Cola";
		sprmkt[1][0][1] = "Orange Juice";
		sprmkt[1][0][2] = "Lemonade";
		sprmkt[1][0][3] = "Green Tea";
		sprmkt[1][0][4] = "Black Coffee";

		// Electronics Main category 1 - Snacks

		sprmkt[1][1][0] = "Popcorn";
		sprmkt[1][1][1] = "Trail Mix";
		sprmkt[1][1][2] = "Beef Jerky";
		sprmkt[1][1][3] = "Salted Nuts";
		sprmkt[1][1][4] = "Rice Cakes";

		// Electronics Main category 1 - Dairy Products

		sprmkt[1][2][0] = "Cottage Cheese";
		sprmkt[1][2][1] = "Trail Mix";
		sprmkt[1][2][2] = "Heavy Cream";
		sprmkt[1][2][3] = "Ice Cream";
		sprmkt[1][2][4] = "Parmesan Cheese";

		// Electronics Main category 1 -Produce

		sprmkt[1][3][0] = "Apples";
		sprmkt[1][3][1] = "Bananas";
		sprmkt[1][3][2] = "Carrots";
		sprmkt[1][3][3] = "Potatoes";
		sprmkt[1][3][4] = "Onions";

		System.out.println("Electronics Main category 1 - Produce:  " + sprmkt[1][3][3] );

	}

}

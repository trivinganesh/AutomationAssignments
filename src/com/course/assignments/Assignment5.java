package com.course.assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {

		/*
		 * Create list of the top 5 most populated countries in the world and print 2nd
		 * Country
		 * 
		 * 
		 */
		System.out.println("Question-1");

		List<String> popltdCountry = new ArrayList<String>();
		popltdCountry.add("India");
		popltdCountry.add("China");
		popltdCountry.add("United States of America");
		popltdCountry.add("Singapore");
		popltdCountry.add("Mexico");

		System.out.println("The most second populated country :" + popltdCountry.get(1));

		/*
		 * Create a set of the top 10 most visited tourist attractions in the world
		 * print out its size
		 */
		System.out.println("Question-2");
		Set<String> trstAttract = new LinkedHashSet<String>();
		trstAttract.add("Vietnam,Asia");
		trstAttract.add("Goa,Asia");
		trstAttract.add("Thailand,Asia");
		trstAttract.add("Manali,India");
		trstAttract.add("Kodaikanal,TamilNadu");
		trstAttract.add("Ooty,TamilNadu");
		trstAttract.add("Nagercoil,TamilNadu");
		trstAttract.add("Coorg,karnataka");
		trstAttract.add("Indonesia,Asia");
		trstAttract.add("Cambodia,Asia");
		// System.out.println(trstAttract);
		System.out.println("Total Tourist Attractions in World size :" + trstAttract.size());

		/*
		 * Create a map of the 5 largest cities in the United States and their
		 * populations.
		 */
		System.out.println("Question-3");
		Map<String, Integer> lrgCities = new LinkedHashMap<String, Integer>();
		lrgCities.put("California", 50000);
		lrgCities.put("Texas", 10000);
		lrgCities.put("Delaware", 45000);
		lrgCities.put("Carolina", 40000);
		lrgCities.put("Washington", 35000);
		System.out.println("Top 5 largest cities in the United States & Population Count :" + lrgCities);

		/*
		 * Create a list of the top 5 highest-grossing movies of all time and print out
		 * the third movie on the list.
		 * 
		 */
		System.out.println("Question-4");
		ArrayList<String> topGrossMovies = new ArrayList<>();
		topGrossMovies.add("Narnia");
		topGrossMovies.add("Sherlock Homes");
		topGrossMovies.add("HarryPotter");
		topGrossMovies.add("Mr Bean");
		topGrossMovies.add("Avatar");

		System.out.println("The third movie on the list is: " + topGrossMovies.get(2));

		/*
		 * Create an array of 10 random integers and print out the sum of 3rd and 5th
		 * Value.
		 */
		System.out.println("Question-5");

		int[] randomnumber = new int[10];
		randomnumber[0] = 45;
		randomnumber[1] = 46;
		randomnumber[2] = 78; // 3rd value
		randomnumber[3] = 85;
		randomnumber[4] = 52; // 5th value
		randomnumber[5] = 53;
		randomnumber[6] = 96;
		randomnumber[7] = 57;
		randomnumber[8] = 63;
		randomnumber[9] = 50;

		System.out.println("The sum 3rd and 5th value:"+(randomnumber[2] + randomnumber[4]));

		/*
		 * Question-1 The most second populated country :China 
		 * Question-2 Total Tourist Attractions in World size :10 
		 * Question-3 Top 5 largest cities in the United States & Population Count :{California=50000, Texas=10000, Delaware=45000,
		 * Carolina=40000, Washington=35000} 
		 * Question-4 The third movie on the list is:HarryPotter 
		 * Question-5 130
		 */

	}

}

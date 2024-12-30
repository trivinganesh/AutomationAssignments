package com.creatio.crm.language.basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionCodeTesting {

	public static void main(String[] args) {

		int[] randomnumber = new int[10];
		String value= "sum of third 3rdvalue & 5th value";
		
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
		
		System.out.println(randomnumber[2] + randomnumber[4]);

	}

}

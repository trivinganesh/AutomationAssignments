package com.course.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionCodeAssign4 {

	public static void main(String[] args) {

		/*
		 * This code 3 different cases with 3 different data and their cases STUDENT
		 * DETAILS, EMPLOYEE DETAILS,PRODUCT DETAILS. While running the program, we
		 * should get output as product supplier as OFFICE DEPOT.
		 * 
		 */

		// Below metioned details are StudentDetails

		Map<String, String> studentdetails1Hashmap = new HashMap<String, String>();
		studentdetails1Hashmap.put("Name", "JohnDoe");
		studentdetails1Hashmap.put("Age", "20");
		studentdetails1Hashmap.put("Gender", "Male");
		studentdetails1Hashmap.put("RollNumber", "S12345");
		studentdetails1Hashmap.put("Grade", "A");
		studentdetails1Hashmap.put("Major", "ComputerScience");
		studentdetails1Hashmap.put("GPA", "3.8");
		studentdetails1Hashmap.put("Email", "john@example.com");
		studentdetails1Hashmap.put("ContactNumber", "9999997777");
		studentdetails1Hashmap.put("Address", "123 Elm St");

		Map<String, String> studentdetails2Hashmap = new HashMap<String, String>();
		studentdetails2Hashmap.put("Name", "JaneSmith");
		studentdetails2Hashmap.put("Age", "21");
		studentdetails2Hashmap.put("Gender", "Female");
		studentdetails2Hashmap.put("RollNumber", "S12346");
		studentdetails2Hashmap.put("Grade", "B");
		studentdetails2Hashmap.put("Major", "Mathematics");
		studentdetails2Hashmap.put("GPA", "3.5");
		studentdetails2Hashmap.put("Email", "jane@example.com");
		studentdetails2Hashmap.put("ContactNumber", "9876665666");
		studentdetails2Hashmap.put("Address", "456 Oak St");

		Map<String, String> studentdetails3Hashmap = new HashMap<String, String>();
		studentdetails3Hashmap.put("Name", "MikeBrown");
		studentdetails3Hashmap.put("Age", "22");
		studentdetails3Hashmap.put("Gender", "Male");
		studentdetails3Hashmap.put("RollNumber", "S12347");
		studentdetails3Hashmap.put("Grade", "A");
		studentdetails3Hashmap.put("Major", "Physics");
		studentdetails3Hashmap.put("GPA", "3.9");
		studentdetails3Hashmap.put("Email", "mike@example.com");
		studentdetails3Hashmap.put("ContactNumber", "8787876546");
		studentdetails3Hashmap.put("Address", "789 pine St");

		// System.out.println(studentdetails1Hashmap);
		// System.out.println(studentdetails2Hashmap);
		// System.out.println(studentdetails3Hashmap);

		// Below metioned details are EmployeeDetails

		Map<String, String> empDetailsHashmap = new HashMap<String, String>();
		empDetailsHashmap.put("EmpID", "E001");
		empDetailsHashmap.put("Name", "Alice Green");
		empDetailsHashmap.put("Age", "30");
		empDetailsHashmap.put("Gender", "Female");
		empDetailsHashmap.put("Department", "Engineering");
		empDetailsHashmap.put("Position", "Software Engineer");
		empDetailsHashmap.put("Salary", "75,000");
		empDetailsHashmap.put("Email", "alice@example.com");
		empDetailsHashmap.put("contactNumber", "9876543213");

		Map<String, String> empDetails1Hashmap = new HashMap<String, String>();
		empDetails1Hashmap.put("EmpID", "E002");
		empDetails1Hashmap.put("Name", "Bob Joohnson");
		empDetails1Hashmap.put("Age", "35");
		empDetails1Hashmap.put("Gender", "Male");
		empDetails1Hashmap.put("Department", "Marketing");
		empDetails1Hashmap.put("Position", "Marketing Manager");
		empDetails1Hashmap.put("Salary", "85,000");
		empDetails1Hashmap.put("Email", "bob@example.com");
		empDetails1Hashmap.put("contactNumber", "9876543214");

		Map<String, String> empDetails2Hashmap = new HashMap<String, String>();
		empDetails2Hashmap.put("EmpID", "E003");
		empDetails2Hashmap.put("Name", "Carol White");
		empDetails2Hashmap.put("Age", "28");
		empDetails2Hashmap.put("Gender", "Female");
		empDetails2Hashmap.put("Department", "Sales");
		empDetails2Hashmap.put("Position", "Sales Executive");
		empDetails2Hashmap.put("Salary", "65,000");
		empDetails2Hashmap.put("Email", "carol@example.com");
		empDetails2Hashmap.put("contactNumber", "9876543215");

		// Below metioned details are ProductDetails

		Map<String, String> prodDetailsHashmap = new HashMap<String, String>();
		prodDetailsHashmap.put("productID", "P001");
		prodDetailsHashmap.put("Name", "Laptop");
		prodDetailsHashmap.put("Category", "Electronics");
		prodDetailsHashmap.put("Price", "$1,200");
		prodDetailsHashmap.put("Stock Quantity", "50");
		prodDetailsHashmap.put("Supplier", "Tech Supplies");
		prodDetailsHashmap.put("Warranty", "2 Years");
		prodDetailsHashmap.put("Rating", "4.5");
		prodDetailsHashmap.put("Manufacturing Date", "15-01-2023");
		prodDetailsHashmap.put("Expiry Date", "15-01-2025");

		Map<String, String> prodDetails1Hashmap = new HashMap<String, String>();
		prodDetails1Hashmap.put("productID", "P002");
		prodDetails1Hashmap.put("Name", "Desk Chair");
		prodDetails1Hashmap.put("Category", "Furniture");
		prodDetails1Hashmap.put("Price", "$150");
		prodDetails1Hashmap.put("Stock Quantity", "200");
		prodDetails1Hashmap.put("Supplier", "Office Depot");
		prodDetails1Hashmap.put("Warranty", "1 Year");
		prodDetails1Hashmap.put("Rating", "4");
		prodDetails1Hashmap.put("Manufacturing Date", "10-02-2023");
		prodDetails1Hashmap.put("Expiry Date", "N/A");

		Map<String, String> prodDetails2Hashmap = new HashMap<String, String>();
		prodDetails2Hashmap.put("productID", "P003");
		prodDetails2Hashmap.put("Name", "Coffee Maker");
		prodDetails2Hashmap.put("Category", "Kitchen");
		prodDetails2Hashmap.put("Price", "$75");
		prodDetails2Hashmap.put("Stock Quantity", "100");
		prodDetails2Hashmap.put("Supplier", "Kitchen World");
		prodDetails2Hashmap.put("Warranty", "6 Months");
		prodDetails2Hashmap.put("Rating", "4.2");
		prodDetails2Hashmap.put("Manufacturing Date", "20-03-2023");
		prodDetails2Hashmap.put("Expiry Date", "20.03-2024");

		// Below mentioned Student details are combined with Hashmap process and
		// ListArray Process

		List<Map<String, String>> studentdetailsArrayList = new ArrayList<Map<String, String>>();
		studentdetailsArrayList.add(studentdetails1Hashmap);
		studentdetailsArrayList.add(studentdetails2Hashmap);
		studentdetailsArrayList.add(studentdetails3Hashmap);

		/* System.out.println(studentdetails1Hashmap); */

		// Below mentioned Emp details are combined with Hashmap process and
		// ListArrayProcess

		List<Map<String, String>> empDetailsArrayList = new ArrayList<Map<String, String>>();
		empDetailsArrayList.add(empDetailsHashmap);		
		empDetailsArrayList.add(empDetails1Hashmap);
		empDetailsArrayList.add(empDetails2Hashmap);

		// Below mentioned Prdct details are combined with Hashmap process and
		// ListArrayProcess

		List<Map<String, String>> PrdctDetailsArrayList = new ArrayList<Map<String, String>>();
		PrdctDetailsArrayList.add(prodDetailsHashmap);
		PrdctDetailsArrayList.add(prodDetails1Hashmap);
		PrdctDetailsArrayList.add(prodDetails2Hashmap);

		/*
		 * Print the outputs statment as "Supplier = OfficeDepot"
		 */
		Map<String, List<Map<String, String>>> details = new HashMap<String, List<Map<String, String>>>();
		details.put("StudentDetails", studentdetailsArrayList);
		details.put("EmployeeDetails", empDetailsArrayList);
		details.put("ProductDetails", PrdctDetailsArrayList);

		///
		String supplier = details.get("ProductDetails").get(1).get("Supplier");
		System.out.println(supplier);

	}

}

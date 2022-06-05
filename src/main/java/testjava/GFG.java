package testjava;// Java program to Convert Map to List

// Importing required classes
import java.util.*;
// Importing stream sub-package
import java.util.stream.*;

// Main class
// MapToList
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Scanner class to take input of key-value pairs
		Scanner sc = new Scanner(System.in);

		// Creating a Hashmap which maps rollno with student
		// name
		Map<String, String> map
			= new HashMap<String, String>();

		// Command for better usability
		System.out.println("Enter No of Students");

		// Taking input to Hashmap
		// via iterating using for loop
		int noOfStudents = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < noOfStudents; i++) {

			String input = sc.nextLine();
			String[] studentdata = input.split(" ");

			String rollno = studentdata[0];
			String name = studentdata[1];

			// Simply inserting received pairs to Map
			map.put(rollno, name);
		}

		// Now first create list of keys and values
		List<String> ListofKeys = null;
		List<String> ListofValues = null;

		// Now converting hashMap to List of keys and values
		ListofKeys = map.keySet().stream().collect(
			Collectors.toCollection(ArrayList::new));
		ListofValues = map.values().stream().collect(
			Collectors.toCollection(ArrayList::new));

		// lastly printing List of rollno and name of
		// students
		System.out.println("List of RollNo of Students");
		System.out.println(ListofKeys.toString());

		System.out.println("List of Name of Students");
		System.out.println(ListofValues.toString());
	}
}

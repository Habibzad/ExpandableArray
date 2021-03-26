package expandableArray;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//Instantiate the expandable array
		ExpandableArray expandableArray = new ExpandableArray();
		//Print intial length
		System.out.println("Initial length " + expandableArray.size());
		//Set a given index with a value
		expandableArray.set(11, "Lisa");
		//Print array length after size increase
		System.out.println("After setting a given index with a value: "+expandableArray.size());
		//Print array elements
		expandableArray.printElements();
	}

}

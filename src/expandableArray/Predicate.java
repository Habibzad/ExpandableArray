package expandableArray;

import java.util.Scanner;

public class Predicate {
	
	Scanner scanner = new Scanner(System.in);
	
	public boolean isNameQ() {		
		String name = scanner.next("Enter name: ");
		return (name == "Q");
	}
	
	public static void main(String[] args) {
		Predicate predicate = new Predicate();
		predicate.isNameQ();
	}

}

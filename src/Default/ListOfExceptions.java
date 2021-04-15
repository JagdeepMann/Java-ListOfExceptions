package Default;

import java.util.ArrayList;

// Tasks:
// 
//	Create ArrayList
//
//	Try to cast each element to an Integer
//
//	Use try/catch blocks to handle the exceptions

public class ListOfExceptions {

	public void list() {

		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");

		for(int i = 0; i < myList.size(); i++) {
			try {			 
				Integer castedValue = (Integer) myList.get(i);
				System.out.println(castedValue);
			} catch (ClassCastException e) {
				System.out.println("Exception!");

			}
		}
	}
}

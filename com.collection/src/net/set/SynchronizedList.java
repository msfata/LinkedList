package net.set;

//Java program to demonstrate 
//synchronizedList() method for String Value 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
	public static void main(String[] argv) throws Exception {
		try {

			// creating object of List<String>
			List<String> list = new ArrayList<String>();
			// populate the list
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
			list.add("E");
			System.out.print("Oreginal List  ");
			list.forEach((value) -> System.out.print(value + " , "));

			List <String>synclist = Collections.synchronizedList(list);
			System.out.println();
			System.out.print("Synchronized   ");
			synclist.forEach((value) -> System.out.print(value + " , "));
		}

		catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}

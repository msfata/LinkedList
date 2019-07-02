package com.set;

/*
 * MSFATA Programming Help
 */
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		/*
		 * creating hash set
		 */
		HashSet<String> set = new HashSet<String>();
		/*
		 * adding data to set
		 */
		set.add("Mohammed");
		set.add("Shafiq");
		set.add("Fata");
		set.add("Shafiq");

		/*
		 * reading hash set using lambda expression
		 */
		set.forEach((value) -> System.out.println(value));
	}
}

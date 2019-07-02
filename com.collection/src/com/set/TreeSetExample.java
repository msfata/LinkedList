package com.set;

/*
 * MSFATA Programming Help
 */
import java.util.TreeSet;

public class TreeSetExample{

	public static void main(String[] args) {
		/*
		 * creating tree set
		 */
		TreeSet<Integer> set = new TreeSet<Integer>();
		/*
		 * setting tree set values
		 */
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(3);
		/*
		 * reading tree set values using lambda expression
		 */
		set.forEach((value) -> System.out.println(value));
	}
}

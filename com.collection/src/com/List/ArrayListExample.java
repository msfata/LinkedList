package com.List;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		/*
		 * creating array list
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();
		/*
		 * adding value to array list
		 */
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		/*
		 * reading array list
		 */
		al.forEach((v) -> System.out.println(v));
	}
}

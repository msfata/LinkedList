package com.List;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		/*
		 * create a linked list
		 */
		LinkedList<String> ll = new LinkedList<String>();
		/*
		 * adding value to linked list
		 */
		ll.add("Mohammed");
		ll.add("Shafiq");
		ll.add("Fata");
		/*
		 * reading the linked list
		 */
		ll.forEach((v) -> System.out.println(v));
	}
}

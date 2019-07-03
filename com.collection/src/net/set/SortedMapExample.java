package net.set;

import java.util.SortedMap;
import java.util.TreeMap;
/*
 * @author MSFATA ProgrammingHelp
 */
public class SortedMapExample {
	public static void main(String[] args) {
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(new Integer(2), "Afghanistan");
		sm.put(new Integer(3), "UAE");
		sm.put(new Integer(5), "USA");
		sm.put(new Integer(4), "UK");
		sm.put(new Integer(1), "France");
		sm.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}

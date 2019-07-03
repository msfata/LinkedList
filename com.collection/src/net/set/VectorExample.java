package net.set;
/*
 * @author MSFATA Programming Help
 */
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		/*
		 * creating vector
		 */
		Vector<String> v = new Vector<String>();
		/*
		 * adding values to vector
		 */
		v.add("Mohammed");
		v.add("Shafiq");
		v.add("Fata");
		/*
		 * reading vector values using lambda for each
		 */
		v.forEach((value) -> System.out.println(value));

	}
}

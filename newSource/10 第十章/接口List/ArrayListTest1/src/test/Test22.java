package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test22 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("c");

		list.remove("a");

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

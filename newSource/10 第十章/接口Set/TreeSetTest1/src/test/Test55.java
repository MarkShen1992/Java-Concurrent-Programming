package test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test55 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(9);
		set.add(1);
		set.add(2);

		System.out.println(set.first());
		System.out.println(set.last());

	}
}

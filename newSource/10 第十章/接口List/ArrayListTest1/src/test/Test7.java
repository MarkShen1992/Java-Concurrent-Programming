package test;

import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("大中国1");
		list.add("大中国2");

		System.out.println(list.contains("大中国2"));
	}
}

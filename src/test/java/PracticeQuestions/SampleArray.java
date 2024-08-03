package PracticeQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SampleArray {

	public static void main(String[] args) {

//		String str1 = "Java";
//		String str2 = new String("Java");
//		String str3 = "Java";
//		System.out.println(str1==str2);
//		System.out.println(str1.equals(str2));
//		System.out.println(str1==str3);

		List a = new ArrayList();
		a.add("hello");
		a.add(2);
		System.out.println(a.get(0) instanceof Object);
		System.out.println(a.get(1) instanceof Object);

//		HashSet num = new HashSet();
//		num.add(10);
//		num.add(20);
//		num.add(30);
//		System.out.println(num.size());

	}
}

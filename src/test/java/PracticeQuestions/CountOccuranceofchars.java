package PracticeQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceofchars {

	public static void main(String[] args) {

		String str = "Rally";
		countOccurances(str);
	}

	private static void countOccurances(String str) {

		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		
		char[] string =str.toCharArray();
		for (char c : string) {
			if(mp.containsKey(c)) {
				mp.put(c,mp.get(c)+1);
			}
			else {
				mp.put(c,1);
			}
		}
		for (Map.Entry<Character, Integer> count : mp.entrySet()) {
			
			System.out.println(count.getKey()+" Repeated:"+count.getValue());
		}
	}

}

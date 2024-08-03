package PracticeQuestions;

public class ReverseAString {

	public static void main(String[] args) {

		String str = "Gnanesh";
		String rev =reverseString(str);
		System.out.println("after reversing string: "+rev);
	}

	private static String reverseString(String str) {

		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev =rev +str.charAt(i);
		}
		return rev;
	}
}

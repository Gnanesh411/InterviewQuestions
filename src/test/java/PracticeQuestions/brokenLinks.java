package PracticeQuestions;

import java.net.HttpURLConnection;
import java.net.URL;

public class brokenLinks {

	public static void main(String[] args) throws Exception {
		URL link = new URL("https://www.qspiders.com/");
		HttpURLConnection con = (HttpURLConnection)link.openConnection();
		int code = con.getResponseCode();
		System.out.println(code);
		String msg =con.getResponseMessage();
		System.out.println(msg);
	}
}

package PracticeQuestions;

import java.util.*;
public class IpAddressValidation {

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String IPAddress = sc.nextLine();
     String regex = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])"; 
    String pattern = regex + "."
              + regex + "."
              + regex + "."
              + regex; 
              if(IPAddress.matches(pattern)){
                  System.out.println("Valid");
              }
              else{
                  System.out.println("Invalid");
              }
    }
}
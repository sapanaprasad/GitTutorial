package ecommerce;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrome p=new Palindrome();
	
		System.out.println(p.reverseString());
		

	}
	public String reverseString() {
		String revString="";
		String s="hello";
		for(int i=s.length()-1;i>=0;i--) {
			revString+=s.charAt(i);
		}
		return revString;
	}

}

package com.practise;

public class Palindrome {

	public static void main(String[] args) {
		
		String s2 = "noon",temp = "";
		
		for (int i=s2.length()-1; i >=0; i--) {
			char ss = s2.charAt(i);
			temp +=ss;	
		}
		System.out.println(temp);
//		        temp==s2
		if (temp.equals(s2)) {
			System.out.println("Its is Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
	}

}

package com.practise;

public class ReverseGivenString {
	
	public static void main(String[] args) {
//		            0123
		String s = "Java";
//		                         (3210)
		for (int i = s.length()-1;i>=0; i--) {// index based 
			char charAt = s.charAt(i);
			System.out.print(charAt);
			
			
		}
//		System.out.println(s.length()-1);
	}
	
	

}

package com.practise;

public class SentenceReverse {

	public static void main(String[] args) {
		
		
		String s = "Welcome to my home";
		 String[] ss = s.split(" ");
		 
		 for (int i =ss.length-1; i >=0; i--) {
			 System.out.print(ss[i]+" ");
		}

	}

}

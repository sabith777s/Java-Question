package com.practise;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n = 1234,temp = 0,result = 0;
		
		while (n>0) {
			temp = n%10;
			result = (result*10)+temp;
			n= n/10;
//			System.out.println(temp);
//			System.out.println(result);
			System.out.println(n);
			
		}
		System.out.println(result);

	}

}

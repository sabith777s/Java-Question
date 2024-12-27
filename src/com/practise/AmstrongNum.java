package com.practise;

public class AmstrongNum {

	public static void main(String[] args) {
		
		int n = 370,num = n,temp = 0,result = 0;
		
		while (n>0) {
			temp = n%10;//0,7,3
			result = result+(temp*temp*temp);
			n= n/10;
//			System.out.println(temp);
//			System.out.println(n);
			
		}
		if (num==result) {
			System.out.println("Amstrong");
			
		} else {
			System.out.println("Not An Amstrong");

		}
//		System.out.println(temp);
//		System.out.println(result);
//		System.out.println(n);
	}
}

package com.practise;

import java.util.HashSet;

public class RemoveArrayDuplicate {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,2,5,3};
		// hashset--> don't allow duplicate
		HashSet<Integer> set = new HashSet<Integer>();
		for (int num : arr) {
			set.add(num);
			
		}
		System.out.println(set);

	}

}

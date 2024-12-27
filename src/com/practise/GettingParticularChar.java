package com.practise;

import java.util.LinkedHashMap;

public class GettingParticularChar {

	public static void main(String[] args) {
		
		String s = "JayaCharu";
		// hashmap-- print random
		//linkedhashmap-- print in order
		
		LinkedHashMap<Integer, Character> m = new LinkedHashMap<Integer, Character>();
		for (int i = 0; i < s.length(); i++) {
			m.put(i, s.charAt(i));
			
			
		}
		System.out.println(m);

	}

}

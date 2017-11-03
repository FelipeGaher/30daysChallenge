package com.livenodead.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08 {
	public static void main(String[] potato) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> theMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			theMap.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			if(theMap.containsKey(s)) {
				System.out.println(s+ "="+theMap.get(s));
			}else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}

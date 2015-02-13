package com.personal.collections;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		
		map.put("a", 1);
		map.put("b", 2);
		map.put("a", 3);
		
		for(String key : map.keySet()) {
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}
	}

}

package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class test {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("hi", "you");
		
		String text = map.get("jkl");
		System.err.println(text);
	}
}

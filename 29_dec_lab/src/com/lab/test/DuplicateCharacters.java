package com.lab.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.*;

public class DuplicateCharacters {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str = br.readLine(); 
		int len = str.length();
		if(len > 0) {
			
			Map<Character,Integer> m = new HashMap<>();
			
			for(int i = 0; i < len; i++)
			{
				char ch = str.charAt(i);
				if(ch != ' ')
				{
					if(m.containsKey(ch))
					{
						m.put(ch, m.get(ch) + 1);
					}else m.putIfAbsent(ch, 1);
				}
				 
			}
			
			 for (Map.Entry<Character,Integer> entry : m.entrySet()) 
		            System.out.println(entry.getKey() + " = " + entry.getValue());
			
		}
		 
	}

}

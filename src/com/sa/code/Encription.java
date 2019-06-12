package com.sa.code;
import java.util.HashMap;
import java.util.Map;

public class Encription {
	
	public static void main(String args[]) {
		String keyword = "AAASSSDDDEEEA";
		Map<Character,Integer> store = new HashMap<Character,Integer>();
		char[] chaArray = keyword.toCharArray();
		
		for (int i = 0; i < chaArray.length; i++) {
			int x = store.containsKey(chaArray[i]) ? store.get(chaArray[i])+ 1 : 1;
			store.put(chaArray[i],x);
			
		}
		store.forEach((k,v) -> System.out.print(v + "" + k));

	}
}

package com.p2.hashset;

import java.util.HashMap;

public class BelajarHashMap{
	public static void main(String[] arg){
		HashMap hm = new HashMap();
		
		hm.put("Game1","Hearts");
		hm.put("Game5","sweeper");
		hm.put("Game3","Checker");
		hm.put("Game3","Whist");
		hm.put(null,"Chess");
		hm.put("Game4","Chess");

		System.out.println(hm);
		
	}
}

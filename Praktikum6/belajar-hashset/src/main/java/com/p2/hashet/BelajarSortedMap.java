package com.p2.hashset;

import java.util.SortedMap;
import java.util.TreeMap;

public class BelajarSortedMap{
	public static void main(String[] arg){
		SortedMap title = new TreeMap();
		
		title.put(new Integer(3),"Chicker");
		title.put(new Integer(1),"Euchre");
		title.put(new Integer(4),"Chess");
		title.put(new Integer(2),"Tic Tac Toe");

		System.out.println(title);
		
	}
}

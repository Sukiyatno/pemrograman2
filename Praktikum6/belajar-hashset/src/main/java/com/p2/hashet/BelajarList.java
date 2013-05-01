package com.p2.hashset;

import java.util.List;
import java.util.ArrayList;

public class BelajarList{
	public static void main( String[] arg){
		List ls = new ArrayList();
		ls.add("satu");
		ls.add("dua");
		ls.add(new Integer(4));
		ls.add(new Float(3.0f));
		ls.add("dua");
		ls.add(new Integer(4));
		
		System.out.println(ls);
	}
}

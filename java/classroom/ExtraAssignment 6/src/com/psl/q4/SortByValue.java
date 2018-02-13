package com.psl.q4;

import java.util.Comparator;
import java.util.Map;

public class SortByValue implements Comparator< Integer> {

	 private Map <Integer, String> map;
	 public SortByValue(Map<Integer,String> map) {
		// TODO Auto-generated constructor stub
		 this.map=map;
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return map.get(o1).compareTo(map.get(o2));
	}

}

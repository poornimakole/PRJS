package com.psl.demo;

public class GenericsDemo<T> {
	private T obj;
	public GenericsDemo(T obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
	}
	public void setObj(T obj)
	{
		this.obj=obj;
	}
	public T getObj()
	{
		return obj;
	}
	
	public static void main(String[] args) {
		
		GenericsDemo<String> g1 =new GenericsDemo<String>(new String("Persistent"));
		
		GenericsDemo<Integer> g2 =new GenericsDemo<Integer>(new Integer(10));
		
		String str=g1.getObj();
		
		System.out.println(str);
		
	    Integer str1= g2.getObj();
		
		System.out.println(str1);
	}
}

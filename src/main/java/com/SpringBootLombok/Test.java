package com.SpringBootLombok;

public class Test {
	public static void main(String...args)
	{
		String s1=new String("A");
		String s2=new String("A");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
	}

}

package com.bridgelabz;

public class variableMethodBlock {

	static int a=10;
	static void display ()
	{
		System.out.println("STATIC METHOD");
	}
	static
	{
		System.out.println("STATIC BLOCK");
	}	
	public static void main(String[] args) {
		// there is no need of calling an object
		System.out.println(a);
		display();
	}
}

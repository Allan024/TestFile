package org.git;

public class Git_class 
{
	
	public Git_class() 
	{
		System.out.println("Sample Class");
	}
	
	public void  add() 
	{
		int a , b;
		int c;
		
		a =10;
		b= 20;
		c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Git_class gc = new Git_class();
		gc.add();
	}	

}

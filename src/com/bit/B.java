package com.bit;

public class B {

	public static void main(String[] args) {
          
	 A	x= new A();
	 int y = x.performAnAction();
	 int z = y * 7;
	 int d = z/2;
	 
	 String l=x.concateValue();
	 System.out.println(l);
	 
	 String f = x.m1("hi");
	 String p = f.concat("  hello");
	 System.out.println(p);
	 
	}

}

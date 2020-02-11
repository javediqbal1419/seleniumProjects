package com.oop;

public class TriangleTest {

	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.setBase(5);
		tr.setHeight(10);
		float area1 = tr.area();
		System.out.println("base: "+tr.getBase());
		System.out.println("Height: "+tr.getHeight());
		System.out.println("Area: "+area1);
		
 
	}

}

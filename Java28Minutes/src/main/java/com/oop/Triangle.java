package com.oop;

public class Triangle {
	private int base;
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	private float height;

	public float getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public float area() {
		float result = base*height;
		return result;
		
	}

}

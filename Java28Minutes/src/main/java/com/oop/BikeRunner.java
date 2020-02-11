package com.oop;

public class BikeRunner {


	public static void main(String[] args) {
		Bike honda = new Bike();
		Bike suzuki = new Bike();
		
		
		
		honda.setSpeed(500);
		System.out.println(honda.getSpeed());
		suzuki.setSpeed(100);
		System.out.println(suzuki .getSpeed());

	}

}

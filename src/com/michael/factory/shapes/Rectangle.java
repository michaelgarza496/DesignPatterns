package com.michael.factory.shapes;

// step 2: create concrete classes implementing the same interface
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");

	}

}

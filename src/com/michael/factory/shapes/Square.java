package com.michael.factory.shapes;

//step 2: create concrete classes implementing the same interface
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");

	}

}

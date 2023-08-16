package com.example.java8.lambdaexpressions;

interface Drawable {
	public void draw();
}


public class LambdaExpressionExample {

	public static void main(String[] args) {
		Drawable d = () -> {
			System.out.println("Drawing");
		};
		
		d.draw();

	}

}

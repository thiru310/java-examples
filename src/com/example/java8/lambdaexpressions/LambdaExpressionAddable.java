package com.example.java8.lambdaexpressions;


interface Addable {
	public int add(int a, int b);
}
public class LambdaExpressionAddable {

	public static void main(String[] args) {
		Addable add = (int a, int b) -> (a+b);
		System.out.println(add.add(10, 20));
		

	}

}

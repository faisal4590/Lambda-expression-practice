package com.faisal.lambdaPractice.LambaPractice;

interface LambdaWithDefaultAndStaticMethodInterface {
	String abstractMethod(String data);

	default public void defaultMethodExample() {
		System.out.println("Default method");
	}

	static void staticMethod() {
		System.out.println("Static method");
	}
}

public class LambdaWithDefaultAndStaticMethod {

	LambdaWithDefaultAndStaticMethodInterface obj = (String passedData) -> {
		// instance create na korei parameter er upor base kore match kore nilo //
		// inferface er abstract method er sathe.

		return passedData;
	};

}

package com.faisal.lambdaPractice.LambaPractice;

interface Deserializer {
	public int deserialize(String v1);
}

public class MethodReferrenceWithLambda {
	public int convertToInt(String v1) {
		return Integer.valueOf(v1);
	}
}

class test {
	MethodReferrenceWithLambda stringConverter = new MethodReferrenceWithLambda();
	Deserializer des = stringConverter::convertToInt;//calling the function as a reference
}



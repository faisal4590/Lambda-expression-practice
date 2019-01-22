package com.faisal.lambdaPractice.LambaPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingLambda {

	@Test
	public void TestLambdaWithDefaultAndStaticMethod() {
		LambdaWithDefaultAndStaticMethod obj1 = new LambdaWithDefaultAndStaticMethod();
		String s1 = obj1.obj.abstractMethod("Faisal Ibn Aziz");
		
		assertEquals("Faisal Ibn Aziz", s1);
	}
	
	@Test
	public void TestMethodRefferenceWithLambda()
	{
		MethodReferrenceWithLambda stringConverter = new MethodReferrenceWithLambda();
		
		assertEquals(123, stringConverter.convertToInt("123"));
		
	}
}

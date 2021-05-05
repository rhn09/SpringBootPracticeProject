package org.sample;

public class AnotherTest {

	private Test test;
	
	public AnotherTest() {
		setTest(new Test());
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public void method() {
		//this.test.method();
	}
}

package com.javaintro;

public class TestDemo5 {
	
	static void method1() {
		TestDemo5 t = new TestDemo5();
		t.method2();
		System.out.println("method1 called");
	}
	
	void method2() {
		System.out.println("method2 called");
		method3();
	}
	
	static void method3() {
		TestDemo5 t = new TestDemo5();
		t.method4();
		System.out.println("method3 called");
	}
	
	void method4() {
		System.out.println("method4 called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		int a=2;
		int b=4;
		
		System.out.println(a+b);
		method1();
		System.out.println("main method ended");
	}

}


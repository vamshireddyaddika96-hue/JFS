package com.javaintro;

public class Testdemo6 {
	
	static void method1() {
		method2();
		System.out.println("method1 called");
	}
	
	void method2() {
		method3();
		System.out.println("method2 called");
	}
	
	void method3() {
		method4();
		System.out.println("method3 called");
	}
	
	void method4() {
		System.out.println("method4 called");
		method5();
	}
	
	void method5() {
		System.out.println("method5 called");
		method6();
	}
	
	void method6() {
		System.out.println("method6 called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Testdemo6 t = new Testdemo6();
		t.method1();
		System.out.println("main method ended");

	}

}

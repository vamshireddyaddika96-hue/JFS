package com.javaintro;

public class Testdemo4 {
	
	static void hello() {
		System.out.println("hello guys good morning");
	}
	
	void welcome() {
		System.out.println("welcome to vcube");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(Thread.currentThread());
		Testdemo4 t = new Testdemo4();
		hello();
		t.welcome();
		hello();
		System.out.println("main method ended");
	}

}

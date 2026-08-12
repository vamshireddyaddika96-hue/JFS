package com.javaintro;

		public class employee {
			static employee e1 = new employee();
			{
				System.out.println("instance block called ");
				employee e1 = new employee();
			}
			static {
				System.out.println("static block called ");
			}
			public static void main(String args[]) {
				System.out.println("main method started ");
				System.out.println("main method ended ");


	}

}

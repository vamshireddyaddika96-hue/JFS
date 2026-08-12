package com.javaintro;

public class ArrayExample {

public static void main(String[] args) {


// Declare and initialize an array of integers

int[] numbers = {1, 2, 3, 4, 5};


// Access elements of the array using indices

System.out.println("First number: " + numbers[0]); // Prints 1

System.out.println("Last number: " + numbers[4]); // Prints 5


// Modify an array element

numbers[2] = 10; // Change the third element (index 2) to 10


// Print the updated array

System.out.println("Updated array:");

for (int i = 0; i < numbers.length; i++) {

System.out.println("Element at index " + i + ": " + numbers[i]);

}


// Array of Strings

String[] fruits = {"Apple", "Banana", "Cherry"};

System.out.println("First fruit: " + fruits[0]); // Prints Apple

}

}
package com.zarriacook.laba;

public class LabA {
	public static void main(String[] args) {	
		System.out.println("Hello from the main method.");
		System.out.println(add(6,2));
		System.out.println(subtract(6,2));
		System.out.println(divide(6,2));
		System.out.println(multiply(6,2));
		System.out.println(circumference(2));
		
	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int subtract(int a, int b) {
		int diff = a - b;
		return diff;
	}
	
	public static int divide(int a, int b) {
		int quo = a / b;
		return quo;
	}
	
	public static int multiply(int a, int b) {
		int pro = a * b;
		return pro;
	}
	public static double circumference(int d) {
		double cir = 3.1415926535 * d;
		return cir;
	}
}



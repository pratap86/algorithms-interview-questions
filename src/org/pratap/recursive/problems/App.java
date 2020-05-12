package org.pratap.recursive.problems;

public class App {

	public static void main(String[] args) {

		Algorithms algo = new Algorithms();
		
		System.out.println(" Iterative : "+algo.sumIterative(5));
		
		System.out.println(" Recursive : "+algo.sumRecursion(5));
		
		System.out.println(" factorial "+algo.factorial(3));
	}

}

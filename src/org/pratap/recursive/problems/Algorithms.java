package org.pratap.recursive.problems;
/**
 * Recursive vs Iterative approach
 * @author Pratap Narayan
 *
 */
public class Algorithms {

	public int sumIterative( int n ) {
		
		int result = 0;
		
		for( int i = 1; i <= n; ++i ) {
			result += i;
		}
		
		return result;
	}

	public int sumRecursion( int n ) {
		
		if( n == 1 ) return 1;
		
		return n + sumRecursion(n - 1);
	}
	
	public int factorial(int n) {
		
		if (n == 1) return 1;
		
		return n * factorial(n-1);
		
	}
	
}

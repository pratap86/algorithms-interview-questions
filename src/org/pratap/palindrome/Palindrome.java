package org.pratap.palindrome;
/**
 * "A palindrome is a string that reads the same forward and backward"
 *  For example: radar or madam
 * @author Pratap Narayan
 *
 */
public interface Palindrome {
	
	public static boolean palindrome1(String originalString) {
		
		String reversedString = "";
		
		for(int i = 0; i < originalString.length(); i++) {
			reversedString += originalString.charAt(originalString.length() - i -1);
		}
		
		if(originalString.equals(reversedString)) return true;
		
		return false;
	}
	
	public static boolean palindrome2(String str) {
		
		int i = 0;
		int j = str.length() - 1;
		int k = (i+j)/2;
		
		for( int index = i; index <= k; ++index ) {
			
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
		
	}

}

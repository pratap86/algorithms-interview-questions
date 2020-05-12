package org.pratap.strings;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		StringOperations strOperation = new StringOperations();
//		System.out.println(strOperation.revertString("racecar"));
//		List<String> prefixes = strOperation.getPrefixes("House");
		
//		prefixes.forEach(System.out::println);
		
//		System.out.println(strOperation.longestCommonPrefix("Hello", "H23rer"));
		System.out.println(strOperation.longestRepeatedSubString("hellowhelloewrwrhelloh"));
	}
}

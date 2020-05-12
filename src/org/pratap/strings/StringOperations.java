package org.pratap.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperations {

	// O(N)
	public String revertString(String text) {

		int lengthOfText = text.length();

		StringBuilder reversedString = new StringBuilder();

		for (int index = lengthOfText - 1; index >= 0; index--) {
			reversedString.append(text.charAt(index));
		}
		return reversedString.toString();
	}

	/**
	 * 
	 * @param text
	 * @return
	 * suffixes of "house" are e, se, use, ouse, house
	 */
	public List<String> getSuffixes(String text) {

		int lengthOfText = text.length();

		List<String> suffixesList = new ArrayList<>();

		for (int index = 0; index < lengthOfText; ++index) {

			suffixesList.add(text.substring(index, lengthOfText));
		}

		return suffixesList;
	}

	public List<String> getPrefixes(String text) {

		int lengthOfText = text.length();

		List<String> prefixesList = new ArrayList<>();

		for (int index = 1; index < lengthOfText + 1; ++index) {

			prefixesList.add(text.substring(0, index));
		}

		return prefixesList;
	}
	/**
	 * 
	 * @param text1
	 * @param text2
	 * @return String
	 * if text1 = "hello", text2 = "hel123Dc", than longest common prefix would be hel
	 */
	public String longestCommonPrefix(String text1, String text2) {
		
		int commonLength = Math.min(text1.length(), text2.length());
		
		for(int index = 0; index < commonLength; ++index) {
			if(text1.charAt(index) != text2.charAt(index)) {
				return text1.substring(0, index);
			}
		}
		return text1.substring(0, commonLength);
	}
	
	/**
	 * 
	 * @param text
	 * @return String (longest repeated sub string)
	 * if text = "hellohqwje123helloh", than it would return helloh
	 */
	public String longestRepeatedSubString(String text) {

		int lengthOfText = text.length();
		
		List<String> suffixes = getSuffixes(text);
		Collections.sort(suffixes);
		
		String longestSubString = "";
		
		for( int i = 0; i < lengthOfText - 1; i++ ) {
			
			String tempString = longestCommonPrefix(suffixes.get(i), suffixes.get(i+1));
			if(tempString.length() > longestSubString.length()) {
				longestSubString = tempString;
			}
		}

		return longestSubString;
	}
}

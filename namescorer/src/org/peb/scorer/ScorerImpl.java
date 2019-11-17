package org.peb.scorer;

import java.util.Arrays;

public class ScorerImpl implements Scorer {
	// Positional array to lookup value A = 0, B = 1, etc.
	private static Character[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

	/**
	 * Scores a name as the sum of the letters' place in the alphabet using the array above 
	 */
	@Override
	public int scoreName(String name) {
		int result = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int val = Arrays.binarySearch(chars, ch);
			// Skips non-alphabetic characters such as ' " '
			if (val >= 0) {
				// Add one so we're not off by one (A should be equal to 1)
				result += (val + 1);
			}
		}
		return result;
	}
	
	/**
	 * Scores the whole array of names. The list's score is the sum of the names
	 * times their position in the alphabetized list. 
	 */
	@Override
	public int score(String[] names) {
		Arrays.sort(names);
		int result = 0;
		for (int i = 0; i < names.length; i++) {
			result += (i + 1) * scoreName(names[i]);
		}
		
		return result;
	}

}

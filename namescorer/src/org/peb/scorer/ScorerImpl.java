package org.peb.scorer;

import java.util.Arrays;

public class ScorerImpl implements Scorer {
	private static Character[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	                               
	public int scoreName(String name) {
		int result = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int val = Arrays.binarySearch(chars, ch);
			if (val >= 0) {
				result += (val + 1);
			}
		}
		return result;
	}
	
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

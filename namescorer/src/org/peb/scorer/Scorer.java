package org.peb.scorer;

public interface Scorer {

	/**
	 * This function scores an individual name
	 * 
	 * @param name  The name to be scored
	 * @return The name's score
	 */
	int scoreName(String name);
	
	/**
	 * This function completely scores the entire array of names
	 * 
	 * @param names The array of names to be scored
	 * @return The list's total score
	 */
	int score(String[] names);
	
}

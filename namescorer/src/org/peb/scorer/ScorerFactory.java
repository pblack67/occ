package org.peb.scorer;

public class ScorerFactory {
	/**
	 * Factory that returns a new ScorerImpl.
	 * Other impls can be swapped in here easily.
	 * 
	 * @return a new Scorer implementation
	 */
	public static Scorer create() {
		return new ScorerImpl();
	}
	
}

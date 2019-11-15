package org.peb.scorer;

public class ScorerFactory {
	
	public static Scorer create() {
		return new ScorerImpl();
	}
	
}

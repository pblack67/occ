package org.peb.scorer;

public class ScoreUtility {
	/**
	 * Simple utility to score names according to the requirements. 
	 * It reads the names from a file and then scores them accordingly.
	 * Other versions of this could use another form of input such as JSON
	 */
	public static void main(String[] args) {
		if (args.length == 1) {
			Scorer scorer = ScorerFactory.create();
			System.out.println(scorer.score(NameReader.getNames(args[0])));
		} else {
			System.out.println("Usage: java ScoreUtility filename");
		}
	}
	
}

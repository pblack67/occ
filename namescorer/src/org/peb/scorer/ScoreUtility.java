package org.peb.scorer;

public class ScoreUtility {
	
	public static void main(String[] args) {
		if (args.length == 1) {
			Scorer scorer = ScorerFactory.create();
			System.out.println(scorer.score(NameReader.getNames(args[0])));
		} else {
			System.out.println("Usage: java ScoreUtility filename");
		}
	}
	
}

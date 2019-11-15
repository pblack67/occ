package org.peb.scorer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScorerTester {

	@Test
	void testSimpleList() {
		Scorer scorer = new ScorerImpl();
		String[] names = {"MARY","PATRICIA","LINDA","BARBARA","VINCENZO","SHON","LYNWOOD","JERE","HAI"};
		assertEquals(3194, scorer.score(names));
	}
	
	@Test
	void testBigList() {
		Scorer scorer = new ScorerImpl();
		assertEquals(871198282, scorer.score(ScoreUtility.getNames("C:\\Users\\pblac\\Documents\\names.txt")));
	}
}

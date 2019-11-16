package org.peb.scorer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScorerTester {

	@Test
	void testSimpleList() {
		Scorer scorer = ScorerFactory.create();
		String[] names = {"MARY","PATRICIA","LINDA","BARBARA","VINCENZO","SHON","LYNWOOD","JERE","HAI"};
		assertEquals(3194, scorer.score(names));
	}
	
	@Test
	void testBigList() {
		Scorer scorer = ScorerFactory.create();
		String[] names = NameReader.getNames("C:\\Users\\pblac\\Documents\\names.txt");
		assertEquals(871198282, scorer.score(names));
	}
}

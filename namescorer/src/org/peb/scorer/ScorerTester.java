package org.peb.scorer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
		File file = new File("C:\\Users\\pblac\\Documents\\names.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String blobOfNames = br.readLine();
			String[] names = blobOfNames.split(",");
			assertEquals(871198282, scorer.score(names));
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

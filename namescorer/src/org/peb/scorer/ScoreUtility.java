package org.peb.scorer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoreUtility {

	public static void main(String[] args) {
		Scorer scorer = new ScorerImpl();
		File file = new File(args[0]);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String blobOfNames = br.readLine();
			String[] names = blobOfNames.split(",");
			System.out.println(scorer.score(names));
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

package org.peb.scorer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoreUtility {

	public static String[] getNames(String fileName) {
		String[] names = new String[0];
		File file = new File(fileName);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String blobOfNames = br.readLine();
			names = blobOfNames.split(",");
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return names;
	}
	
	public static void main(String[] args) {
		if (args.length == 1) {
			Scorer scorer = ScorerFactory.create();
			System.out.println(scorer.score(getNames(args[0])));
		} else {
			System.out.println("Usage: java ScoreUtility filename");
		}
	}
	
}

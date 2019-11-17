package org.peb.scorer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NameReader {
	/**
	 * Simple file reader that reads in a file.
	 * The file's format is a comma-separated list of names in one line.
	 * 
	 * @param fileName the name of the file
	 * @return array of names 
	 */
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

}

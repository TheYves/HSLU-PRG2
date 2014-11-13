package ch.hslu.prg2.sw8;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Yves Hohl (yves.hohl@stud.hslu.ch) on 07.11.2014.
 */
public class SolidFileIO {

	public static Cube[] readSolids(String fileName) {
		int number = 1;
		String line = "";
		ArrayList<Cube> list = new ArrayList<>();
		FileReader fileReader;
		BufferedReader bufferedReader;

		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				String tokens[] = line.split("[: ]");
				switch (tokens[0]) { // is it a Cube, Sphere or Cylinder?
					case "C":
						int s1 = Integer.parseInt(tokens[2]);
						int s2 = Integer.parseInt(tokens[3]);
						int s3 = Integer.parseInt(tokens[4]);
						list.add(new Cube(number, s1, s2, s3));
						break;
				}
			}

		} catch (IOException e) {
			System.out.println("Error while reading file " + fileName);
		}

		return list.toArray(new Cube[list.size()]);
	}

}

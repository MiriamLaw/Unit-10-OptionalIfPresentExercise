package com.coderscampus.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	public static List<SuspectLocation> getSuspectsFromFile() {
		List<SuspectLocation> locations = new ArrayList<>();

		String[] fileNames = { 
				"InterpolWatchReport-Week1.csv", 
				"InterpolWatchReport-Week2.csv",
				"InterpolWatchReport-Week3.csv" 
				
		};

		for (String fileName : fileNames) {

			try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {

				String line;
				String headerLine = fileReader.readLine();
				while ((line = fileReader.readLine()) != null) {
					String[] reportData = line.split(",");
					if (reportData.length == 2) {
						String country = reportData[0];
						String name = reportData[1];
						SuspectLocation location = new SuspectLocation(country, name);
						locations.add(location);
					}

				}
			} catch (IOException e) {
				e.printStackTrace();

			}

		}
		return locations;
	}
}

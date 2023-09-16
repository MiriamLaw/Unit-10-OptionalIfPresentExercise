package com.coderscampus.domain;

import java.util.List;
import java.util.Optional;

public class SuspectLocationApplication {

	public static void main(String[] args) {

		List<SuspectLocation> suspectLocations = FileService.getSuspectsFromFile();

		Optional<SuspectLocation> carmenLocation = suspectLocations.stream()
																   .filter(location -> "CARMEN SANDIEGO".equals(location.getName()))
																   .findAny();

	
		carmenLocation.ifPresentOrElse(location -> System.out.println("Carmen Sandiego is in " + location.getCountry()),
				() -> System.out.println("Galdang, just missed her!")

		);

	}
}

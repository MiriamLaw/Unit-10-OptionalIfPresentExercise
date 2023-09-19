package com.coderscampus.domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SuspectLocationApplication {

	public static void main(String[] args) {

		List<SuspectLocation> suspectLocations = FileService.getSuspectsFromFile();
		
		//debug statement
		System.out.println("Total Suspect Locations: " + suspectLocations.size());

		List<SuspectLocation> carmenLocation = suspectLocations.stream()
																   .filter(suspect -> "CARMEN SANDIEGO".equals(suspect.getName()))
																   .collect(Collectors.toList());
		
		
			if (!carmenLocation.isEmpty()) {
				System.out.println("Carmen Sandiego is in the following countries: ");
				carmenLocation.forEach(location -> System.out.println(location.getCountry()));
			} else {
				System.out.println("Galdang, just missed her!");
			}
//																   .peek(System.out::println)
//																   .findAny(); //use findAll;
//
//	
//		carmenLocation.ifPresentOrElse(location -> System.out.println("Carmen Sandiego is in " + location.getCountry()),
//				() -> System.out.println("Galdang, just missed her!")
//
//		);

	}
}

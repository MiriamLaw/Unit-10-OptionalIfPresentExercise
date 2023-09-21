package com.coderscampus.domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SuspectLocationApplication {

    public static void main(String[] args) {

        List<SuspectLocation> suspectLocations = FileService.getSuspectsFromFile();

        // Filter the suspect locations by Carmen Sandiego's name
        List<SuspectLocation> carmenLocations = suspectLocations.stream()
                												.filter(location -> location.getName().equals("CARMEN SANDIEGO"))
                												.collect(Collectors.toList());

        // Create an optional of the carmen locations list
        Optional<List<SuspectLocation>> carmenLocationList = Optional.of(carmenLocations);

        // If the carmen location list is present, print the countries to the console
        carmenLocationList.ifPresentOrElse(
                locations -> locations.forEach(location -> System.out.println("Carmen Sandiego is in " + location.getCountry())),
                () -> System.out.println("Galdang, just missed her!")
        );
    }
}

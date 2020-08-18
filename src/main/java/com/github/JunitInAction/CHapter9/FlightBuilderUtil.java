package com.github.JunitInAction.CHapter9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FlightBuilderUtil {
    public static Flight buildFlightFromCsv() throws IOException {
        Flight flight = new Flight("AA1234", 20);
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(
                             "src/test/resources/flights_information.csv"))) {
            String line = null;
            do {
                line = reader.readLine();
                if (line != null) {
                    String[] passengerString = line.toString().split(";");
                    Passenger passenger =
                            new Passenger(passengerString[0].trim(),
                                    passengerString[1].trim());
                    flight.addPassenger(passenger);
                }
            } while (line != null);

        }

        return flight;
    }
}

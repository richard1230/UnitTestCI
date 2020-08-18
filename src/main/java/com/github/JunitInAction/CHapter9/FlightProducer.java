package com.github.JunitInAction.CHapter9;

import javax.enterprise.inject.Produces;
import java.io.IOException;

public class FlightProducer {
    @Produces
    public Flight createFlight() throws IOException {
        return FlightBuilderUtil.buildFlightFromCsv();
    }
}

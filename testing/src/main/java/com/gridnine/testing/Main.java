package com.gridnine.testing;

import static java.lang.System.out;

public class Main 
{
    public static void main( String[] args )
    {
//    	out.println("Original list");
//    	FlightBuilder.createFlights().stream().forEach(out::println);

    	out.println("Except departure in the past");
    	FlightBuilder.createFlights().stream()
    		.filter(new DepartueInPastFlightRule())
    		.forEach(out::println);

    	out.println("Except departs before arrives");
    	FlightBuilder.createFlights().stream()
    		.filter(new DepartsBeforeArrivesFlightRule())
    		.forEach(out::println);

    	out.println("Await less 2 hours");
    	FlightBuilder.createFlights().stream()
    		.filter(new MaxGroundTimeFlightFilter())
    		.forEach(out::println);
    }
}

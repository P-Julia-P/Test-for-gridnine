package com.gridnine.testing;

import java.util.function.Predicate;

@FunctionalInterface
public interface FlightRuleFilter extends Predicate<Flight> {
	

}

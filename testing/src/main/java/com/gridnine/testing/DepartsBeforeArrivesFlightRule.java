package com.gridnine.testing;

public class DepartsBeforeArrivesFlightRule extends AbstractFlightRuleFilter {

	public DepartsBeforeArrivesFlightRule() {
		super(s -> s.getArrivalDate().isAfter(s.getDepartureDate()));
	}

}

package com.gridnine.testing;

import java.time.LocalDateTime;

public class DepartueInPastFlightRule extends AbstractFlightRuleFilter {

	public DepartueInPastFlightRule() {
		super(s -> !s.getDepartureDate().isBefore(LocalDateTime.now()));
	}


}

package com.gridnine.testing;

import java.time.Duration;

public class MaxGroundTimeFlightFilter implements FlightRuleFilter {

	public static final int DEFAULT_MAX_AWAIT_HOURS = 2;
	
	private int maxAwaitHours;
	
	public MaxGroundTimeFlightFilter() {
		this(DEFAULT_MAX_AWAIT_HOURS);
	}
	public MaxGroundTimeFlightFilter(int maxAwaitHours) {
		this.maxAwaitHours = maxAwaitHours;
	}

	@Override
	public boolean test(Flight t) {
		Segment ps = null;
		long awaitTime = 0; // seconds
		for(Segment s : t.getSegments()) {
			if (ps != null)
				awaitTime += Duration.between(ps.getArrivalDate(), s.getDepartureDate()).toSeconds();
			ps = s;
		}
		return awaitTime <= maxAwaitHours * 60 * 60;
	}

}

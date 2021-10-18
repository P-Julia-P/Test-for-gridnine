package com.gridnine.testing;

public abstract class AbstractFlightRuleFilter implements FlightRuleFilter {

	private SegmentRuleFilter segmentRule;
	
	public AbstractFlightRuleFilter(SegmentRuleFilter segmentRule) {
		this.segmentRule = segmentRule;
	}

	@Override
	public boolean test(Flight t) {
		return t.getSegments().stream().allMatch(segmentRule);
	}

}

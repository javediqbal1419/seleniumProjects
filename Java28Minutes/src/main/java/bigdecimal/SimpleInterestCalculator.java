package bigdecimal;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principle;
	BigDecimal interest;
	public SimpleInterestCalculator(String principle, String interest) {
	
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}


	
	
	// total amount = principle + (principle*interest*years)
	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal noOfYearBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue1 = principle.add(principle.multiply(interest)).multiply(noOfYearBigDecimal);
		return totalValue1;
	}
}

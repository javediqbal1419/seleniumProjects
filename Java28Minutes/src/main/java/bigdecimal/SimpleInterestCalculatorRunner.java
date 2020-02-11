package bigdecimal;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		
		
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("2500", "5"); 
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println("Total Amount is : "+totalValue);
	}

}

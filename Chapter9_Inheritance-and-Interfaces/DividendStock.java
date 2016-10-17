package Chapter9;

public class DividendStock extends Stock{
	private double dividends;  // amount of dividends paid
	
	public DividendStock(String theSymbol, double currentPrice) {
		super(theSymbol, currentPrice);
		dividends = 0.0;
	}
	
	public double getMarketValue() {
		return super.getMarketValue() + dividends;
	}
	
	// records a dividend of the given amount per share
	public void payDividend(double amountPerShare) {
		dividends += amountPerShare * getTotalShares();
	}
}

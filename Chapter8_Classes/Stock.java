package Chapter8;

//A Stock object represents purchases of shares of a stock.

public class Stock {
	private String symbol;       // stock symbol, e.g. "YHOO"
	private int totalShares;     // total shares purchased
	private double totalCost;    // total cost for all shares
	 
	// initializes a new Stock
	// pre: symbol != null
	public Stock(String theSymbol, int shares, double pricePerShare) { 
		if (theSymbol == null) {
			throw new NullPointerException();
		}
		symbol = theSymbol;
		purchase(shares, pricePerShare);
	}
	
	// initializes a new Stock with no shares purchased
	public Stock(String theSymbol) { 
		this(theSymbol, 0, 0.0);
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public int getTotalShares() {
		return totalShares;
	}
	
	// returns the total profit or loss earned on this stock,
	// based on the given price per share
	// pre: currentPrice >= 0.0
	public double getProfit(double currentPrice) {
		if (currentPrice < 0.0) {
			throw new IllegalArgumentException();
		}
		double marketValue = totalShares * currentPrice;
		return marketValue - totalCost;
	}
	
	// records purchase of the given shares at the given price
	// pre: shares >= 0 && pricePerShare >= 0.0 
	public void purchase(int shares, double pricePerShare) {
		if (shares < 0 || pricePerShare < 0.0) {
			throw new IllegalArgumentException();
		}
		totalShares += shares;
		totalCost += shares * pricePerShare;
	} 
}

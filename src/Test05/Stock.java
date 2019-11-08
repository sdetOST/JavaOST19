package Test05;
public class Stock {

	String tickerSymbol;
	String companyName;
	int price;
	double percentChange;
	int totalShares;
	long marketCap;
	
	

public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
	}
//	public Stock(String tickerSymbol, String companyName, int price, 
//			double percentChange, int totalShares,long marketCap) {
//		this.tickerSymbol = tickerSymbol;
//		this.companyName = companyName;
//		this.price = price;
//		this.percentChange = percentChange;
//		this.totalShares = totalShares;
//		this.marketCap = totalShares * price;
//	}
	public void adjustPrice(int value) {
	  int temp = price;
		this.price = value;
		this.percentChange = 100*(value-temp)/temp;
		this.marketCap = totalShares * value;
		
		
	}
	@Override
	public String toString() {
		return "Ticker Symbol: " + tickerSymbol + "\nCompany: " + companyName
				+ "\nCurrent Price: " + price + "\nMarket Cap: " + marketCap;
	}
	
}
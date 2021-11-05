package broker.twotier.vo;
/**
 * 
 * @author HaBaRee
 * 
 * Stock 테이블의 정보를 저장하는 클래스,,
 * 주식의 이름, 주식의 가격으로 필드가 구성된다.
 *
 */
public class StockRec {
	private String symbol;
	private float price;
	
	public StockRec(String symbol, float price) {
		this.symbol = symbol;
		this.price = price;
	}
	public StockRec() {
		this("",0.0F);
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "StockRec [symbol=" + symbol + ", price=" + price + "]";
	}
}


public class Book {
	public String[] title;
	public String[] author;
	public double[] number;
	public double[] price;
	
	
	public double allPrice(double[] number, double[] plice) {
		return number * price;
	}
	
	
	public void over() {
		if(number >= 1000) {
			System.out.println(title);
		}
	}
	
	public double eff(double number, double plice) {
		return number / price;
	}
	
	
	
	
	
	
}

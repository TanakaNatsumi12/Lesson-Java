
import java.util.Scanner;

public class OnlineShop {
	public static void main(String[] args) {
		
		double sum = 0;
		double tax = 1.1;
		
		System.out.println("商品の単価を入力してください:");
		
		Scanner sca = new Scanner(text.in);
		
		System.out.println("購入個数を入力してください:"):
		Scanner sca2 = new Scanner(text.in);
		
		sum += sca * sca2;
		
		
		double fivePercent = 0.05;
		double tenPercent = 0.10;
		
		
		public double sealPrice(double sum) {
			if(sum >= 5000) {
			return  sum * fivePercent;
		}else if(sum >= 10000) {
			return  sum * tenPercent;
		}
			if(sca2 >= 3) {
				return sum -= sca2 * 50;
			}else if(sca2 >= 5) {
				return  sca2 * 100;
			}	
		}
		
		public double nonTax() {
			return sum -= sealPlice();
		}
		
		public double inTax() {
			return sum * tax;
		}
		
		
	}
}

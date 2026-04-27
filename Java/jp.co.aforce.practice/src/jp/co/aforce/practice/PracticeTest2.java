package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		
		System.out.println(TAX);
		
		int x = 480;
		
		double price = x * TAX;
		
		System.out.println("税込み金額：" + price);
		
		String name = "田中夏弥";
		
		System.out.println(name);
		
		String frontPert = "この商品の値段は";
		String backPert = "円です";
		
		System.out.println(frontPert + price + backPert);
		
		
		
		
		
	}
	public static final double TAX = 1.1;
}

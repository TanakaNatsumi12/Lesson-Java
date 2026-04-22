package javaPlactice;

public class SplitDecimal {
	public static void main(String[] args) {
		double num = 7.8;
		
		int intPert = (int)num;
		double doublePert = num - intPert;
		
		System.out.println("整数部分；"+ intPert);
		System.out.println("少数部分；"+ doublePert);
	}
}

import java.util.Scanner;

import org.w3c.dom.Text;


public class Amusmentpark {
	public static void main(String[] args) {
		System.out.println("年齢を入力してください");
	Scanner sca = new Scanner(Text.in);
	
	
	
	
	
	if(sca >= 0 && sca <= 3) {
		System.out.println("無料");
	}else if(sca >= 4 && sca <= 12) {
		System.out.println("500円");
	}else if(sca >= 13 && sca <= 17) {
		System.out.println("800円");
	}else if(sca >= 18 && sca <= 59) {
		System.out.println("1200円");
	}else if(sca >= 60 && sca <= 120) {
		System.out.println("700円");
	}else {
		System.out.println("年齢が不正な値です");
	}
	
	
	
	}
	
	
	
}

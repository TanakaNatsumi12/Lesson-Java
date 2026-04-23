import java.util.Scanner;
public class forthSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("番号を入力してください");
		int num = sc.nextInt();
		String month;
		
		switch(num) {
		case 1:
			month = "1月";
			break;
		case 2:
			month = "2月";
			break;
		case 3:
			month = "3月";
			break;
		case 4:
			month = "4月";
			break;
		case 5:
			month = "5月";
			break;
		case 6:
			month = "6月";
			break;
		case 7:
			month = "7月";
			break;
		case 8:
			month = "8月";
			break;
		case 9:
			month = "9月";
			break;
		case 10:
			month = "10月";
			break;
		case 11:
			month = "11月";
			break;
		case 12:
			month = "12月";
			break;
		default:
			month = "不正な値です";
		}
		
		System.out.println(month);
		
		
	}
	
	
	
}

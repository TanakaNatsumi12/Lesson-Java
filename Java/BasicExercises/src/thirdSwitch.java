import java.util.Scanner;
public class thirdSwitch {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("数字を入力してください");
		int num = sca.nextInt();
		
		String date;
		
		switch(num) {
		case 1:
			date = "monday";
			break;
		case 2:
			date = "tuesday";
			break;
		case 3:
			date = "wednesday";
			break;
		case 4:
			date = "thursday";
			break;
		case 5:
			date = "friday";
			break;
		case 6:
			date = "satuday";
			break;
		case 7:
			date = "sunday";
			break;
		default:
			date = "不正な値です";	
		}
		
		System.out.println(date);
		
	}
}

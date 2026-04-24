import java.util.Scanner;
public class forthIf {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("年齢を入力してください");
		int num = sca.nextInt();
		
		if(num <= 12) {
			System.out.println("無料");
		}else if(num >= 13 && num <= 59) {
			System.out.println("1000円");
		}else if(num >= 60) {
			System.out.println("500円");
		}
		
		sca.close();
	}
}

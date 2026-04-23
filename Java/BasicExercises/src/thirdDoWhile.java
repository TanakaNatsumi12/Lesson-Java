import java.util.Scanner;
public class thirdDoWhile {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("整数を入力してください（0で終了）");
		int num = sca.nextInt();
		int sum = 0;
		
		do {
			sum += num;
			System.out.println("整数を入力してください（0で終了）");
			num = sca.nextInt();
		}while(num !=  0);
		
		System.out.println("合計：" +  sum);
		
		
		
	}
}

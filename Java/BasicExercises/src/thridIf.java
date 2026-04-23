import java.util.Scanner;
public class thridIf {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("整数を入力してください");
		
		int num1 = sca.nextInt();
		int num2 = sca.nextInt();
		int num3 = sca.nextInt();
		
		if(num1 > 0 && num2 > 0 && num3 > 0 &&
				num1 + num2 > num3 &&
				num1 + num3 > num2 &&
				num2 + num3 > num1) {
			System.out.println("これらは三角形の辺の長さとして有効です");
		}else {
			System.out.println("これらは三角形の辺の長さとして有効ではありません");
		}
		
		sca.close();
		
	}
}

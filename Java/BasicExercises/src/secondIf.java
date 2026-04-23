import java.util.Scanner;
public class secondIf {
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.print("整数を入力してください");
		int num = sca.nextInt();
		
		if(num>0) {
			System.out.println(num + "は正の数です");
		}else if(num<0) {
			System.out.println(num + "は負の数です");
		}else {
			System.out.println(num + "は不正な値です");
		}
		
		sca.close();
		
	}
}

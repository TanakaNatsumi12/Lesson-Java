import java.util.Scanner;
public class fifthSwitch {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("対応するアルファベットを入力してください");
		String alf = sca.next();
		
		String grade;
		
		switch(alf) {
		case "A":
			grade = "大変よく頑張りました";
			break;
		case "B":
			grade = "よく頑張りました";
			break;
		case "C":
			grade = "頑張りました";
			break;
		case "D":
			grade = "もう少し頑張りましょう";
			break;
		case "F":
			grade = "赤点";
			break;
		default:
			grade = "不正な値です";
		}
		
		System.out.println(grade);
	}
}

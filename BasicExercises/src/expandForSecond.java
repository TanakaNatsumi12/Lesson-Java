import java.util.ArrayList;
import java.util.List;

public class expandForSecond {
	public static void main(String[] args) {
		
		List<String> userName = new ArrayList<>();
		
		userName.add("佐藤");
		userName.add("鈴木");
		userName.add("高橋");
		userName.add("山田");
		
		for(String users: userName) {
			System.out.println("名前：" + users);
		}
	}
}

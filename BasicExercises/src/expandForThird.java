import java.util.ArrayList;
import java.util.List;

public class expandForThird {
	public static void main(String[] args) {
		
List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(11);
		numbers.add(23);
		numbers.add(4);
		numbers.add(13);
		numbers.add(26);
		
		int sum = 0;
		
		for(int x: numbers) {
			sum += x;		
		}
		
		System.out.println("合計：" + sum);
	}
}

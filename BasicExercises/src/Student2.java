
public class Student2 {
	
	String name;
	int[] scores;
	
	double sum = 0;
	
	public void plus() {
		for( int subject :scores) {
			sum += subject;
			System.out.println("合計：" + sum);
		}
	
	public void ave() {
		double avera = sum / scores.length;
		System.out.println("平均：" + avera);
	}
		
		
}

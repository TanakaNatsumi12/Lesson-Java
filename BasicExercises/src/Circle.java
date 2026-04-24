
public class Circle {
	int radius;
	double n;
	
	Circle(int radius, double n){
		this.radius = radius;
		this.n = n;
	}
	
	public void answer(){
		double a = n * radius * radius;
		System.out.println("面積:" + a);
	}
	
//	public void showAnswer() {
//		System.out.println("答え" + a);
//	}
}

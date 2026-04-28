
public class plusOverl {
	int a;
	int b;
	
	
	plusOverl(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	
	
	public void showPlus() {
		System.out.println("合計；" + sum(a, b));
	}
	
	
	
}



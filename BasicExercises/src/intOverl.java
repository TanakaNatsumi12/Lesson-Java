
public class intOverl {
	public static int sum(int a , int b) {
		return a + b;
	}
        
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	 public static void main(String[] args) {
	 int result = sum(5 ,6);
     int result2 = sum (9, 38, 21);
      
     System.out.println("2つの整数の和: " + result);
     System.out.println("3つの整数の和: " + result2);
     
     System.out.println(sum(9,2,11));
	 }
}
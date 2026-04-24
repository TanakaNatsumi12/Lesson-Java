
public class Rectangle {
	
	int hieght;
	int width;
	
	Rectangle(int hieght,int width){
		this.hieght = hieght;
		this.width = width;
	}
	
	public void area() {
		int are = hieght * width;
		System.out.println("面積：" + are);
	}
	
	
}

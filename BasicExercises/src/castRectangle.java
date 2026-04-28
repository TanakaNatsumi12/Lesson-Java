
public class castRectangle implements castShape{
	public double width;
	public double height;
	
	castRectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("Drawing Rectangli");
	}
	
	public double getArea() {
		return width * height;
	}
	
}


public class castCircle implements castShape{
	public double radius;
	
	castCircle(double radius){
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("Drawimg Circle");
	}
	
	public double getRadius() {
        return radius;
    }
	
}

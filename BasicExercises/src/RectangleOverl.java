
public class RectangleOverl {
	int width;
	int height;
	
	
	
	RectangleOverl(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	RectangleOverl(int width){
		this.width = width;
		this.height = width;
	}
	
	 public String toString() {
	        return "width=" + width + ", height=" + height;
	    }
	
}

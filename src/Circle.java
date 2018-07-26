//Amna Anjum 
// Shontinique Uqdah 
public class Circle {

	private double radius; 
	private String color;
	
	//getter
	public double getRadius() { 
		return radius;
	}
	
	//this is setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
		//automatically generated getter
		public String getColor() {
			return color;
		}
		//automatically generated setter
		public void setColor(String color) {
			this.color = color;
		}

	
	
	public static String getShape() {
		return "Circle"; 
	}
	
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return Math.PI * radius * 2; 
	}
	
	//toString determines what the object will look like 
	//when printed directly into console 
	public String toString() {
		return "Circle with radius" + radius;
	}
	
	
	
	//constructor
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
 
	
	
	
	
	
	
}

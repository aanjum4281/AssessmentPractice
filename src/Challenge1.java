import java.util.ArrayList;

//Amna Anjum
// Shontinique Uqdah 

public class Challenge1 {
 public static void main(String [] args) {
//make an array list for rectangles and circles 
	ArrayList<Circle> circles = new ArrayList<>();
	
	Circle circle1 = new Circle(3, "blue");
	Circle circle2 = new Circle(5, "yellow");
	Circle circle3 = new Circle(7, "red"); 
	
	circles.add(circle1);
	circles.add(circle2);
	circles.add(circle3);
	
	double max = 0;
	int j = 0; 
	double min = Double.MAX_VALUE;
	int f = 0;
	
	for ( int i = 0; i < circles.size(); i++ ) {
		
		double curr = circles.get(i).getArea(); 
		if (max < circles.get(i).getArea() ) {
			max = curr;
		j = i;
		} 
		
		if (min > curr) {
			min = curr;
			f = i; 
		}
	}
	System.out.println( circles.get(j).getColor() + " circle is the largest.");
	System.out.println(circles.get(j).getRadius() + " is the radius.");
	
	System.out.println( circles.get(f).getColor() + "circle is the smallest.");
	System.out.println( circles.get(f).getRadius() + " is the radius.");
	
 }
}

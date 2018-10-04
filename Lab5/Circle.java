public class Circle{
	private double radius;
	private String colour;

	public Circle(){
		radius = 1.0;
		color = "red";
	}
	public Circle(double r){
		radius = r;
		color = "red";
	}
	public Circle(double r, String c){
		radius = r;
		color = c;
	}

	public double getRadius(){
		return this.radius;
	}
	public String getColour(){
		return this.colour;
	}
	public double getArea(){
		return this.radius * this.radius * Math.PI;
	}
}
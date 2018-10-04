public class Shape{
	private String colour;
	public Shape(String colour){
		this.colour = colour;
	}

	@Override
	public String toString(){
		return "Shape of color = \"" + colour  + "\"";
	}

	public double getArea() {
		System.err.println("Shape unknown! Cannot Compute Area!");
		return 0;
	}
}
public class Triangle extends Shape{
	private int base;
	private int height;

	public Triangle(String colour, int base, int height){
		super(colour);
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString(){
		return "Triangle of base = " + this.base + " and height = " + this.height + ", subclass of " + super.toString();
	}

	@Override
	public double getArea(){
		return 0.5 * this.height * this.base;
	}
}
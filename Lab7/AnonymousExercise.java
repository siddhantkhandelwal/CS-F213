
public class AnonymousExercise {
	public Circle getCircle(int radius) {
		return new Circle(radius) {
			@Override
			public double area() {
				return Math.PI * radius * radius;
			}
		};
	}
	
	public static void main(String[] args) {
		AnonymousExercise p = new AnonymousExercise();
		Circle w = p.getCircle(10);
		System.out.println(w.area());
	}
}

class Circle {
	private int rad;
	Circle(int radius) {
		rad = radius;
	}
	public double area() {
		return rad * rad;
	}
}

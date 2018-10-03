
public class MovableCircle implements Movable {
	private MovablePoint center;
	private int radius;
	
	MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	MovableCircle(int x, int y, int speed, int radius) {
		center = new MovablePoint(x, y, speed);
		this.radius = radius;
	}
	@Override
	public String toString(){
		return String.format("x: " + this.center.x + ", y: " + this.center.y + ", radius: " + this.radius);
	}
	public void moveUp(){
		center.y -= center.ySpeed;
	}
	public void moveDown(){
		center.y += center.ySpeed;
	}
	public void moveLeft(){
		center.x -= center.xSpeed;
	}
	public void moveRight(){
		center.x += center.xSpeed;
	}
	
}

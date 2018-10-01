
public class MovablePoint implements Movable{
	int x, y, xSpeed, ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint(int x, int y, int speed){
		this.x = x;
		this.y = y;
		this.xSpeed = speed;
		this.ySpeed = speed;
	}
	@Override
	public String toString(){
		return String.format("x: " + this.x + ", y: " + this.y);
	}
	@Override
	public void moveUp(){
		y -= ySpeed;
	}
	public void moveDown(){
		y += ySpeed;
	}
	public void moveLeft(){
		x -= xSpeed;
	}
	public void moveRight(){
		x += xSpeed;
	}
}
import java.util.Scanner;

class Shape{
	protected int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape{
	protected int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	
}

class Triangle extends Shape{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
	
}

class Circle extends Shape{
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
	
}

public class Dog {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		Rectangle r = new Rectangle();
		s.x=0;
		s.y=0;
        s.draw();
		r.width = 100;
		r.height = 100;
	}
}
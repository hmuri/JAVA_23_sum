import java.util.Scanner;
import java.util.ArrayList;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle을 그립니다.");
	}
	
}

class Rectangle extends Shape{
	public void draw() {
		System.out.println("Rectangle을 그립니다.");
	}
	
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("Triangle을 그립니다.");
	}
	
}

public class main {

	public static void main(String[] args) {
		Rectangle s = new Rectangle();
		s.draw();
	}
}
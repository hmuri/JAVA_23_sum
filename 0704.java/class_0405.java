import java.util.Scanner;
import java.util.ArrayList;

class Shape{
	int x,y;
}

class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		x = 0;
		y = 0;
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
}

public class main {

	public static void main(String[] args) {
		Circle obj = new Circle(10);
		System.out.printf("원의 중심: (%d, %d)\n", obj.x, obj.y);
		System.out.printf("원의 면적: %.1f\n", obj.getArea());
	}
}

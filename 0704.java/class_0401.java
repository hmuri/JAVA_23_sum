import java.util.Scanner;

class Rect{
	int width, height;
	
	public Rect(int w, int h) {
		this.width=w;
		this.height=h;
	}
	double getArea() {	return (double)width*height;	}
}

public class main {

	public static void main(String[] args) {
		Rect[] list;
		list = new Rect[5];
		
		for(int i =0; i<list.length; i++) {
			list[i] = new Rect(i, i);
		}
		for(int i=0; i<list.length; i++) {
			System.out.printf("%d번째 사각형의 면적=%.1f\n", i, list[i].getArea());
		}
	}
}
//수업시간 실습 lab: 자동차 클래스 작성

import java.util.Scanner;

class Car{
	String color;
	int speed;
	int gear;
	
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed+=10;
	}
	void speedDown() {
		speed-=10;
	}
	void changeColor(String color) {
		this.color = color;
	}
}
public class main {
	public static void main(String args[]) {
		Car myCar = new Car();
		myCar.changeGear(1);
		myCar.speedUp();
		myCar.changeColor("red");
		System.out.println(myCar);
	}
}
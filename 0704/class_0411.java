import java.util.Scanner;

class Parent{
	void print() {
		System.out.println("Parent 메소드 호출");
	}
}

class Child extends Parent{
	@Override void print() {
		System.out.println("Child 메소드 호출");
	}
	
}


public class Dog {
	public static void main(String[] args) {
		Parent p = new Child();
		p.print();
		Child c = (Child)p;
		c.print();
	}
}
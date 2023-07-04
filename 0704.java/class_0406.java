import java.util.Scanner;
import java.util.ArrayList;

class Person{
	private String regnumber;
	private double weight;
	protected int age;
	String name;
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}

class Student extends Person{
	int id;
	
}

public class main {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.age=21;
		obj.name="Kim";
		obj.setWeight(75.0);
	}
}
import java.util.Scanner;
import java.util.ArrayList;

class Person{
    String name;
    String number;
    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }
}

public class main {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("홍길동", "01012345678"));
        people.add(new Person("김유신", "01012345678"));
        people.add(new Person("최자영", "01012345678"));
        people.add(new Person("김영희", "01012345678"));
	
    for(Person person : people){
        System.out.printf("(%s, %s)\n", person.name, person.number);
    }
	}
}
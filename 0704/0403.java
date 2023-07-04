//lab Salary

class Employee{
	public int baseSalary = 3000000;
	int getSalary() {	return baseSalary;	}
}

class Manager extends Employee{
	int getSalary() {	return (baseSalary+2000000);	}
}

class Programmer extends Employee{
	int getSalary() {	return (baseSalary+3000000);	}
}

public class main{
	public static void main(String[] args) {
		Manager m1 = new Manager();
		System.out.printf("관리자의 월급 : %d \n", m1.getSalary());
		
		Programmer p1 = new Programmer();
		System.out.printf("프로그래머의 월급 : %d \n", p1.getSalary());
	}
}
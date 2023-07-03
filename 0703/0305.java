//수업시간 실습 Lab: 은행 계좌 클래스 작성
import java.util.Scanner;

class BankCount{
	private String owner;
	private int accountNumber;
	private int balance;
	
	
	public void deposit(int money) {
		this.balance+=money;
	}
	
	public void withdraw(int money){
		this.balance-=money;
	}
	
	public int getBalance() {
		return balance;
	}
}
public class main {
	public static void main(String args[]) {
		BankCount myBank = new BankCount();
		myBank.deposit(100);
		myBank.withdraw(50);
		System.out.printf("잔액은 %d.", myBank.getBalance());
	}
}
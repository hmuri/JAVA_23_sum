public class main{
	public static void main(String[] args) {
		BankAccount b1= new BankAccount();
		BankAccount b2= new BankAccount();
		b1.name = "김동덕";
		b1.accountNo = "1234-5678";
		b1.balance = 100;
		b1.rate = 0.0;
		b2.name = "홍길동";
		b2.accountNo = "9999-2531";
		b2.balance = 2000;
		b2.rate = 2.15;
		
		System.out.printf("첫 번째 은행 계좌의 정보입니다.\n이름: %s\n계좌 번호: %s\n잔액: %d원\n이자율: %.1f%%\n\n", b1.name, b1.accountNo, b1.balance, b1.rate);
		System.out.printf("두 번째 은행 계좌의 정보입니다.\n이름: %s\n계좌 번호: %s\n잔액: %d원\n이자율: %.2f%%", b2.name, b2.accountNo, b2.balance, b2.rate);
	}
}
import java.util.Scanner;

public class Practice31{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date data= new Date();
		
		System.out.print("태어난 년도를 입력하세요: ");
		data.year=sc.nextInt();	
		System.out.print("태어난 월을 입력하세요: ");
		data.month=sc.nextInt();	
		System.out.print("태어난 날짜를 입력하세요: ");
		data.day=sc.nextInt();	
		System.out.printf("당신의 생일은 %d년 %d월 %d일입니다.", data.year, data.month, data.day);

	}
}
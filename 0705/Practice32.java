import java.util.Scanner;

public class Practive32{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date birth= new Date();
		Date adult = new Date();
		
		System.out.print("태어난 년도를 입력하세요: ");
		birth.year = sc.nextInt();	
		adult.year = birth.year+20;
		System.out.print("태어난 월을 입력하세요: ");
		birth.month =sc.nextInt();	
		adult.month = birth.month;
		System.out.print("태어난 날짜를 입력하세요: ");
		birth.day =sc.nextInt();	
		adult.day = birth.day;
		System.out.println("당신의 생일은 " + birth.year + "년 " + birth.month + "월 " + birth.day + "일입니다.");
		System.out.println("당신의 성년일은 " + adult.year + "년 " + adult.month + "월 " + adult.day + "일입니다.");
		System.out.println("당신의 생일은 " + birth.year + "년 " + birth.month + "월 " + birth.day + "일입니다.");
	}
}
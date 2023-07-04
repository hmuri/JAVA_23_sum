import java.util.Scanner;
import java.util.Random;

public class 0306{
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = random.nextInt(50);
		int count=0;
		while(true) {
			System.out.print("정답을 추측하여 보시오 (범위 : 0 ~ 49): ");
			int num = sc.nextInt();
			count++;
			if(num==answer)	break;
			if(num>answer){
				System.out.println("제시한 정수가 높습니다.");
			}else {
				System.out.println("제시한 정수가 낮습니다.");
			}
		}
		System.out.printf("축하합니다. 시도횟수 = %d", count);
	}
}

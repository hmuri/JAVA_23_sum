import java.util.Scanner;
public class 0302 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int sum = 0;
		int count = 0;
		while(score>=0) {
			System.out.print("점수를 입력하시오: ");
			score = sc.nextInt();
			sum+=score;
			count++;
		}
		sum-=score;
		System.out.printf("평균은 %d", sum/(count-1));
	}

}

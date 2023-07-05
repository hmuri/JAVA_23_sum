import java.util.Scanner;

public class Practice33{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r= new Rectangle();
		
		System.out.print("가로 입력: ");
		r.width = sc.nextInt();	
		System.out.print("세로 입력: ");
		r.height =sc.nextInt();	
		System.out.println("면적은 " + r.height*r.width + "입니다.");
		System.out.println("둘레는 " + (r.height+r.width)*2 + "입니다.");
	}
}
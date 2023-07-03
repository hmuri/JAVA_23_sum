import java.util.Scanner;

public class 2901 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print("입력된 정수는 짝수입니다.");
        } else {
            System.out.print("입력된 정수는 홀수입니다.");
        }
    }
}
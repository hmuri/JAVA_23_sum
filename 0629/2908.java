import java.util.Scanner;

public class 2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        int num = sc.nextInt();
        long result = 1;
        for(int i = 1; i<=num; i++){
            result*=i;
        }
        System.out.printf("%d!은 %d입니다", num, result);
    }
}

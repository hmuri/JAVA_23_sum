import java.util.Scanner;

public class 2910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while(num!=-1){
            System.out.print("정수를 입력하시오: ");
            num = sc.nextInt();
            sum+=num;
        }
        System.out.printf("정수의 합은 %d 입니다.", sum+1);
    }
}

import java.util.Scanner;

public class 2909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하시오: ");
        int num = sc.nextInt();
        System.out.printf("%d의 약수는 다음과 같습니다.", num);
        for(int i = 1; i<=((num/2)+1); i++){
            if(num%i==0){
                System.out.printf("%d ", i);
            }
        }
    }
}

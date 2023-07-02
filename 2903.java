import java.util.Scanner;
import java.util.Random;

public class 2903 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("가위(0), 바위(1), 보(2): ");
        int userNum = sc.nextInt();
        int comNum = random.nextInt(3);
        if (comNum == userNum) {
            System.out.printf("인간: %d 컴퓨터: %d    ", userNum, comNum);
            System.out.print("비김");
        } else if ((comNum == 0 && userNum == 2) || 
                   (comNum == 1 && userNum == 0) ||
                   (comNum == 2 && userNum == 1)) {
            System.out.printf("인간: %d 컴퓨터: %d    ", userNum, comNum);
            System.out.print("컴퓨터 승리");
        } else {
            System.out.printf("인간: %d 컴퓨터: %d    ", userNum, comNum);
            System.out.print("인간 승리");
        }
        
    }

}
import java.util.Scanner;

public class Prac1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("아무 키나 입력>>");
        String userInput = scanner.nextLine();
        
        if(!userInput.isEmpty()){
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println("스레드 실행 시작");
                    for(int i=1; i<=10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println("\n스레드 종료");
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}

import java.util.Scanner;

public class 2905 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("피자 종류를 입력하시오: ");
        String pizzaType = scanner.nextLine();
        
        int pizzaPrice;
        
        switch (pizzaType) {
            case "콤비네이션":
                pizzaPrice = 20000;
                break;
            case "페퍼로니":
                pizzaPrice = 12000;
                break;
            case "시카고":
                pizzaPrice = 25000;
                break;
            default:
                System.out.println("목록에 없는 피자 종류입니다.");
                return; // 프로그램 종료
        }
        
        System.out.println("피자 "+ pizzaType +"의 가격=" + pizzaPrice);
    }
}
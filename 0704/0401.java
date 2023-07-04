import java.util.Scanner;

//미니 프로젝트 전기차 클래스
class ECar {
    int distance = 0;
    double battery = 100;
    
    public static ECar getInstance() {
        return new ECar();
    }

    public void drive() {
        if(this.battery >= 10) {
            this.distance += 1;
            this.battery -= 10;
        } else {
            System.out.println("배터리가 모두 소진되었습니다.");
        }
    }

    public void dispDistance() {
        System.out.println("주행거리: " + this.distance + "km");
    }

    public void dispBattery() {
        System.out.println("배터리: " + this.battery + "%");
    }
}

public class main {
    public static void main(String[] args) {
        ECar car = ECar.getInstance();
        
        car.drive();
        car.dispDistance();  // 출력: 주행거리: 1.0km
        car.dispBattery();   // 출력: 배터리: 90.0%

        car.drive();
        car.dispDistance();  // 출력: 주행거리: 2.0km
        car.dispBattery();   // 출력: 배터리: 80.0%
    }
}

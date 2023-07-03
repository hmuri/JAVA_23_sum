import java.util.Scanner;

class Box{
    int width;
    int length;
    int height;
    double getVolumn(){
        return (double) width*height*length;
    }
}

public class 2912 {
    public static void main(String[] args) {
        Box b = new Box();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.printf("상자의 가로, 세로, 높이는 %d, %d, %d 입니다\n", b.width, b.length, b.height);
        System.out.printf("상자의 가로, 세로, 높이는 %.1f입니다\n", b.getVolumn());
    }
}

import java.util.Scanner;

public class 2902 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하시오: ");
        int num = sc.nextInt();
        if(num>=90){
            System.out.print("학점 A");
        }else if(num>=80){
            System.out.print("학점 B");
        }else if(num>=70){
            System.out.print("학점 C");
        }else{
            System.out.print("학점 D");
        }
    }

}
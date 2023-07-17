import java.io.*;
import java.util.*;

public class PhoneWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;

        System.out.println("전화번호 입력 프로그램입니다.");
        try {
            fout = new FileWriter("/Users/minjuchoi/JAVA_23_sum/0717/output.txt");
            while (true) {
                System.out.print("이름 전화번호 >> ");
                String line = scanner.nextLine();
                if (line.equals("그만")) {
                    System.out.println("/Users/minjuchoi/JAVA_23_sum/0717/output.txt에 저장하였습니다.");
                    break;
                }
                fout.write(line);
                fout.write("\r\n");
            }
            fout.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}

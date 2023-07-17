package Employ;
import java.io.*;

public class UpperReader {
    public static void main(String[] args) {
        File file = new File("/etc/hosts"); //macOs에서  IP 주소와 호스트 이름의 매핑 정보를 담고 있는 파
        BufferedReader fin = null;

        System.out.println(file.getAbsolutePath() + "를 출력합니다.");
        try {
            fin = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fin.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

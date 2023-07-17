import java.io.*;

public class PhoneWriter {
    public static void main(String[] args) {
        File file = new File("/Users/minjuchoi/JAVA_23_sum/0717/output.txt");
        BufferedReader fin = null;

        System.out.println(file.getAbsolutePath() + "를 출력합니다.");
        try {
            fin = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fin.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
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

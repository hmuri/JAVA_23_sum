package Employ;
import java.io.*;
import java.util.*;

public class CompareFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String firstFileName = scanner.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String secondFileName = scanner.nextLine();

        System.out.println(firstFileName + "와 " + secondFileName + "를 비교합니다.");

        FileInputStream firstFile = null;
        FileInputStream secondFile = null;
        try {
            firstFile = new FileInputStream(firstFileName);
            secondFile = new FileInputStream(secondFileName);

            if (compareFiles(firstFile, secondFile)) {
                System.out.println("파일이 같습니다.");
            } else {
                System.out.println("파일이 서로 다릅니다.");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (firstFile != null) {
                    firstFile.close();
                }
                if (secondFile != null) {
                    secondFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }

    public static boolean compareFiles(InputStream firstFile, InputStream secondFile) throws IOException {
        int data;
        while ((data = firstFile.read()) != -1) {
            if (data != secondFile.read()) {
                return false;
            }
        }
        if (secondFile.read() != -1) {
            return false;
        }
        return true;
    }
}

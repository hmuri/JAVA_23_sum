import java.util.*;
import java.io.*;

public class RandomGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 난수의 개수를 입력하세요: ");
        int num = scanner.nextInt();

        System.out.println("난수 값의 범위를 설정하세요: ");
        int range = scanner.nextInt();

        int[] numbers = new int[num];
        Random random = new Random();

        System.out.println("생성된 난수는 다음과 같습니다.");
        for (int i = 0; i < num; i++) {
            numbers[i] = random.nextInt(range + 1);
            System.out.print(numbers[i] + " ");
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        
        System.out.println("\n난수 값을 저장할 파일 이름을 입력하세요: ");
        String fileName = scanner.next();
        scanner.close();

        writeFile(numbers, fileName);

        System.out.println("파일 " + fileName + "에 난수값이 저장되었습니다.");
    }

    public static void writeFile(int[] numbers, String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            for (int number : numbers) {
                fw.write(number + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

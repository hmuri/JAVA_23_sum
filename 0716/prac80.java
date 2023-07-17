import java.util.*;
import java.io.*;

public class RandomGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("난수값이 저장된 파일 이름을 입력하세요: ");
        String fileName = scanner.next();
        scanner.close();

        List<Integer> numbers = readFile(fileName);

        System.out.println("파일에서 난수를 읽어 들입니다.");
        System.out.println("난수의 개수는 모두 " + numbers.size() + "개입니다.");

        System.out.println("입력된 난수는 다음과 같습니다.");
        printNumbers(numbers);

        Collections.sort(numbers);

        System.out.println("정렬된 난수는 다음과 같습니다.");
        printNumbers(numbers);
    }

    public static List<Integer> readFile(String fileName) {
        List<Integer> numbers = new ArrayList<>();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public static void printNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + "\t");
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

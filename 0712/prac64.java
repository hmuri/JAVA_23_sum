import java.util.Scanner;

class MyPair<T> {
    private T first;
    private T second;

    public MyPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}


public class prac64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열로 이루어진 순서쌍을 만듭니다.");
        System.out.println("첫번째 원소를 입력하세요: ");
        String firstString = scanner.nextLine();
        System.out.println("두번째 원소를 입력하세요: ");
        String secondString = scanner.nextLine();
        MyPair<String> stringPair = new MyPair<>(firstString, secondString);
        System.out.println("만들어진 순서쌍: " + stringPair);

        System.out.println("숫자로 이루어진 순서쌍을 만듭니다.");
        System.out.println("첫번째 원소를 입력하세요: ");
        int firstInt = scanner.nextInt();
        System.out.println("두번째 원소를 입력하세요: ");
        int secondInt = scanner.nextInt();
        MyPair<Integer> integerPair = new MyPair<>(firstInt, secondInt);
        System.out.println("만들어진 순서쌍: " + integerPair);
    }
}

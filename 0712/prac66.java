import java.util.Scanner;

class MyArray {
    public static <T> T pick(T[] array, int index) {
    	if (index < 0 || index >= array.length) {
            return null;
        } else {
            return array[index];
        }
    }

    public static <T> void displayArray(T[] array) {
        for (T item : array) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    public static <T> void swap(T[] array, int i, int j) {
        if ((i < 0 || i >= array.length) || (j < 0 || j >= array.length)) {
            System.out.println("인덱스가 범위를 벗어났습니다 >>");
            return;
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


public class prac66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sArray = {"하나", "두울", "세엣"};
        Integer[] iArray = {10, 20, 30, 40};

        System.out.println("문자열 배열의 내용입니다.");
        MyArray.displayArray(sArray);
        for (int i = 0; i < 2; i++) {
            System.out.println("문자열 배열에서 찾고 싶은 인덱스를 입력하세요: ");
            int index = scanner.nextInt();
            String result = MyArray.pick(sArray, index);
            if (result == null) {
                System.out.println(index + "번 인덱스 저장 내용 : " + "인덱스가 범위를 벗어났습니다 >> " +result);
            } else {
                System.out.println(index + "번 인덱스 저장 내용 : " + result);
            }
        }
        System.out.println("0번 인덱스에 저장된 값과 교환하고 싶은 인덱스를 선택하세요: ");
        int swapIndex = scanner.nextInt();
        MyArray.swap(sArray, 0, swapIndex);
        System.out.println("변경 후 문자열 배열");
        MyArray.displayArray(sArray);

        System.out.println("정수 배열의 내용입니다.");
        MyArray.displayArray(iArray);
        for (int i = 0; i < 2; i++) {
            System.out.println("정수 배열에서 찾고 싶은 인덱스를 입력하세요: ");
            int index = scanner.nextInt();
            Integer result = MyArray.pick(iArray, index);
            if (result == null) {
                System.out.println(index + "번 인덱스 저장 내용 : " + "인덱스가 범위를 벗어났습니다 >> " +result);
            } else {
                System.out.println(index + "번 인덱스 저장 내용 : " + result);
            }
        }
        System.out.println("0번 인덱스에 저장된 값과 교환하고 싶은 인덱스를 선택하세요: ");
        swapIndex = scanner.nextInt();
        MyArray.swap(iArray, 0, swapIndex);
        System.out.println("변경 후 정수 배열");
        MyArray.displayArray(iArray);
    }
}

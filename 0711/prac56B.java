import java.util.Scanner;

public class Practice56B {
    public static void main(String[] args) {
        try {
            int[] iArray = getInput();
            if (iArray != null) {
                for (int i = 0; i < iArray.length; i++) {
                    iArray[i] = i * 20;
                }
                for (int x : iArray) {
                    System.out.print(x + "\t");
                }
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("배열의 크기가 음수입니다.");
        }
    }

    public static int[] getInput() throws NegativeArraySizeException {
        Scanner s = new Scanner(System.in);
        int[] rslt = null;

        try {
            System.out.print("배열의 크기를 입력하세요: ");
            String str = s.next();
            int num = Integer.parseInt(str);
            rslt = makeArray(num);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 형식의 숫자입니다.");
        }

        return rslt;
    }

    public static int[] makeArray(int size) throws NegativeArraySizeException {
        return new int[size];
    }
}

import java.util.Random;

public class 0305 {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] arr = new int[5][5];
		int count = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j]=random.nextInt(2);
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%d ", arr[i][j]);
				if(arr[i][j]==1) {
					count++;
				}
			}
			System.out.println();
		}
		System.out.printf("현재 관객 수는 %d명입니다.", count);
	}
}
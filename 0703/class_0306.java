//수업시간 실습 배열의 최대값
public class main {
	public static double maxArray(double[] list) {
		double max = list[0];
		
		for(int i=1; i<list.length; i++) {
			if(list[i]>max) {
				max = list[i];
			}
		}
		return max;
	}

	public static void main(String args[]) {
		double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
		double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};
		
		double max;
		max = maxArray(a);
		System.out.println("첫 번째 배열의 최대값=" + max);
		max = maxArray(b);
		System.out.println("두 번째 배열의 최대값=" + max);
	}
}

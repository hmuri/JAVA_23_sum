public class main{
	public  static void main(String[] args) {
		try {
			int n = Integer.parseInt("abc");
			System.out.println("try: " + n);
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		} finally {
			System.out.println("finally");
		}
		System.out.println("continue running");
	}
}
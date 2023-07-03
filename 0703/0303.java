//수업시간 Lab : 안전한 배열 만들기
import java.util.Scanner;

class SafeArray{ // 한 파일에는 public class가 하나만 들어가야 하므로 class SafeArray로 변경
	private int a[];
	public int length;
	
	public SafeArray(int size) {
		a = new int[size];
		length = size;
	}
	
	public int get(int index) {
		if(index >=0 && index <length) {
			return a[index];
		}
		return -1;
	}
	
	public void put(int index, int value) {
		if(index >= 0 && index < length) {
			a[index]=value;
		}else {
			System.out.println("잘못된 인덱스 " + index);
		}
	}
}
public class main {
	public static void main(String args[]) {
		SafeArray array = new SafeArray(3);
		
		for(int i=0; i<(array.length + 1); i++) {
			array.put(i, i*10);
		}
	}

}

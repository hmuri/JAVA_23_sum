import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍콩");
		list.add("싱가포르");
		list.add("괌");
		list.add("사이판");
		list.add("하와이");
		
		System.out.println("여행지 추천 시스템입니다.");
		int index = (int) (Math.random()*list.size());
		System.out.printf("추천 여행지는 %s\n", list.get(index));
	}
}
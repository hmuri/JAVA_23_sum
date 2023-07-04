import java.util.Scanner;

class Movie{
	String title, director;
	static int count;
	
	public Movie(String title, String director) {
		this.title=title;
		this.director=director;
		count++;
	}
}

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Movie [] list = new Movie[10];
		list[0] = new Movie("백투더퓨쳐", "로버트 저메키스");
		list[1] = new Movie("티파니에서 아침을", "에드워드 블레이크");
		
		for(int i =0; i<Movie.count; i++) {
			System.out.println("===========================");
			System.out.printf("제목: %s\n", list[i].title);
			System.out.printf("제목: %s\n", list[i].director);
			System.out.println("===========================");
		}
	}
}
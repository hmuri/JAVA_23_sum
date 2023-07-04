//미니 프로젝트 도서관

import java.util.Scanner;
import java.util.ArrayList;

class Book {
    String title;
    int rating;

    public Book(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public String toString() {
        return "제목: " + this.title + ", 평점: " + this.rating;
    }
}

public class main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("번호를 입력하시오: ");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 출력");
            System.out.println("4. 종료");
            int num = scanner.nextInt();
            scanner.nextLine();

            switch (num) {
                case 1:
                    System.out.println("제목: ");
                    String title = scanner.nextLine();
                    System.out.println("평점: ");
                    int rating = scanner.nextInt();
                    books.add(new Book(title, rating));
                    break;
                case 2:
                    System.out.println("검색할 제목: ");
                    String findTitle = scanner.nextLine();
                    for (Book book : books) {
                    	 if (book.title.equals(findTitle)) {
                             System.out.println(book);
                         } else {
                             System.out.println("해당 제목의 책을 찾을 수 없습니다.");
                         }
                    }
                   
                    break;
                case 3:
                    for(Book book : books) {
                    	System.out.println(book);
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("올바른 번호를 입력하시오.");
                    break;
            }
        }
    }
}


import java.util.Scanner;

class MyBox<T> {
    private T t;

    public MyBox(T t) { 
        this.t = t; 
    }
    
    public void set(T t) { 
        this.t = t; 
    }
    
    public T get() { 
        return t; 
    }
}


public class prac63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MyBox에 저장할 내용을 입력하세요: ");
        String s1 = scanner.next();
        MyBox<String> box1 = new MyBox<>(s1);
        System.out.println("MyBox에 저장된 내용: " + box1.get());

        System.out.println("MyBox에 저장할 내용을 입력하세요: ");
        String s2 = scanner.next();
        box1.set(s2);
        System.out.println("MyBox에 저장된 내용: " + box1.get());

        System.out.println("MyBox에 저장할 내용을 입력하세요: ");
        Integer i1 = scanner.nextInt();
        MyBox<Integer> box2 = new MyBox<>(i1);

        System.out.println("MyBox에 저장할 내용을 입력하세요: ");
        Integer i2 = scanner.nextInt();
        MyBox<Integer> box3 = new MyBox<>(i2);

        int sum = box2.get() + box3.get();
        System.out.println(box2.get() + " + " + box3.get() + " = " + sum);
    }
}

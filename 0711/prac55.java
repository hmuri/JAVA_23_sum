    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isDone = false;
        int num1 = 0, num2 = 0;

        while (isDone != true) {
            try {
                System.out.print("1번 피연산자를 입력하세요: ");
                String str1 = s.next();
                num1 = Integer.parseInt(str1);
                isDone = true;
                break;
            }catch (NumberFormatException e) {
            	System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
            }
        }
        isDone = false;
        while (isDone !=true) {
        	try {
                System.out.print("2번 피연산자를 입력하세요: ");
                String str2 = s.next();
                num2 = Integer.parseInt(str2);
                isDone = true;
                break;
        	}catch (NumberFormatException e) {	
        	System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
        	}
        }

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        isDone = true;
        
    }
}
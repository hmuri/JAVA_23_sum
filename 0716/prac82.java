import java.util.*;
import java.io.*;

class BankAccount {
    private int id;
    private String name;
    private int balance;

    public BankAccount(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.balance;
    }
}

public class BankManager {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
			initializeFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

        while (true) {
            System.out.println("원하는 작업을 선택하세요 (0-종료/1-열기/2-저장/3-계좌업무): ");
            int operation = scanner.nextInt();
            switch (operation) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                case 1:
                    System.out.println("파일 이름을 입력하세요: ");
                    String fname = scanner.next();
                    load(fname, accounts);
                    printAccounts(accounts);
                    break;
                case 2:
                    System.out.println("파일 이름을 입력하세요: ");
                    String fnameToSave = scanner.next();
                    save(fnameToSave, accounts);
                    System.out.println("잔고현황이 성공적으로 저장되었습니다.");
                    break;
                case 3:
                    System.out.println("업데이트할 계좌번호를 입력하세요: ");
                    int id = scanner.nextInt();
                    System.out.println("원하는 계좌 작업을 선택하세요 (1-입금/2-출금): ");
                    int job = scanner.nextInt();
                    BankAccount account = findAccount(id, accounts);
                    if (job == 1) {
                        System.out.println("입금액을 입력하세요: ");
                        int amount = scanner.nextInt();
                        account.deposit(amount);
                        System.out.println("입금이 완료되었습니다.");
                    } else {
                        System.out.println("출금액을 입력하세요: ");
                        int amount = scanner.nextInt();
                        account.withdraw(amount);
                        System.out.println("출금이 완료되었습니다.");
                    }
                    printAccounts(accounts);
                    break;
            }
        }
        
    }
    public static void initializeFile() throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("1 홍길동 3000\n");
        fw.write("2 성춘향 5000\n");
        fw.write("3 김동덕 10000\n");
        fw.close();
    }
    
    public static void save(String fname, ArrayList<BankAccount> list) {
        try (PrintWriter writer = new PrintWriter(new File(fname))) {
            for (BankAccount account : list) {
                writer.println(account);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void load(String fname, ArrayList<BankAccount> list) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fname));
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                list.add(new BankAccount(Integer.parseInt(tokens[0]), tokens[1], Integer.parseInt(tokens[2])));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BankAccount findAccount(int id, ArrayList<BankAccount> list) {
        for (BankAccount account : list) {
            if (account.getId() == id)
                return account;
        }
        return null;
    }

    public static void printAccounts(ArrayList<BankAccount> list) {
        System.out.println("현재 잔고현황입니다.");
        System.out.println("계좌번호 계좌주 잔고");
        for (BankAccount account : list) {
            System.out.println(account);
        }
    }
}

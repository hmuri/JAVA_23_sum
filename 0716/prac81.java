import java.util.*;
import java.io.*;

class BankAccount {
    private int id;
    private String owner;
    private int balance;

    public BankAccount(int id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return id + " " + owner + " " + balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> list = new ArrayList<>();
        
        while (true) {
            System.out.println("원하는 작업을 선택하세요 (0-종료/1-열기/2-저장/3-계좌업무): ");
            int option = scanner.nextInt();
            
            switch (option) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                case 1:
                    System.out.println("파일 이름을 입력하세요: ");
                    String fname = scanner.next();
                    load(fname, list);
                    printAccounts(list);
                    break;
                case 3:
                    System.out.println("업데이트할 계좌번호를 입력하세요: ");
                    int id = scanner.nextInt();
                    BankAccount account = getAccount(id, list);
                    if (account != null) {
                        handleAccount(scanner, account);
                        printAccounts(list);
                    }
                    break;
                default:
                    System.out.println("유효하지 않은 옵션입니다.");
                    break;
            }
        }
    }

    public static void load(String fname, ArrayList<BankAccount> list) {
        try (Scanner fileScanner = new Scanner(new File(fname))) {
            while (fileScanner.hasNext()) {
                int id = fileScanner.nextInt();
                String owner = fileScanner.next();
                int balance = fileScanner.nextInt();
                list.add(new BankAccount(id, owner, balance));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static BankAccount getAccount(int id, ArrayList<BankAccount> list) {
        for (BankAccount account : list) {
            if (account.getId() == id) {
                return account;
            }
        }
        System.out.println("해당 계좌번호의 계좌가 없습니다.");
        return null;
    }

    public static void handleAccount(Scanner scanner, BankAccount account) {
        System.out.println("원하는 계좌 작업을 선택하세요 (1-입금/2-출금): ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("입금액을 입력하세요: ");
                int deposit = scanner.nextInt();
                account.deposit(deposit);
                System.out.println("입금이 완료되었습니다.");
                break;
            case 2:
                System.out.println("출금액을 입력하세요: ");
                int withdraw = scanner.nextInt();
                if (account.withdraw(withdraw)) {
                    System.out.println("출금이 완료되었습니다.");
                } else {
                    System.out.println("잔고가 부족합니다.");
                }
                break;
        }
    }

    public static void printAccounts(ArrayList<BankAccount> list) {
        System.out.println("현재 잔고현황입니다.");
        System.out.println("계좌번호 계좌주 잔고");
        for (BankAccount account : list) {
            System.out.println(account);
        }
    }
}

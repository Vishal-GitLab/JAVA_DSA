package src.Practice.Challenge.Challenge_78;

public class Customer {
    public static void main(String[] args) {


        BankAccount account = new BankAccount("001", "Vishal Chaurasiya");
         account.depositMoney(100);
        System.out.println(account.withDrawMoney(200));
        account.depositMoney(-45);
        account.withDrawMoney(0);
    }
}

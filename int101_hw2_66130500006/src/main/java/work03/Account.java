package work03;

import work01.Utilitor;
import work02.Person;

public class Account {
    private static long nextNo = 100_000_000;
    private final long no;
    private Person owner;
    private double balance;
    public Account(Person owner){
        if (owner == null) throw new NullPointerException();
        this.owner = owner;
        this.balance = 0.0;
        long result = Utilitor.computeIsbn10(nextNo);
        while(result == 10){
            nextNo ++;
            result = Utilitor.computeIsbn10(nextNo);
        }
        this.no = 10 * nextNo + result;
        nextNo++;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public double deposit(double amount){
        try {
            balance += Utilitor.testPositive(amount);
        }
        catch (Exception balance){
            throw new IllegalArgumentException("Cannot deposit");
        }
        return balance;
    }
    public double withdraw(double amount){
        balance -= Utilitor.testPositive(amount);
        return balance;
    }
    public void transfer(double amount, Account account){
        if (account == null || amount > this.balance){
            throw new IllegalArgumentException("cannot transfer");
        }
        this.withdraw(amount);
        account.deposit(amount);

    }
    @Override
    public boolean equals(Object act) {
        if (this == act) return true;
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account(");
        sb.append(no);
        sb.append(",").append(balance);
        sb.append(')');
        return sb.toString();
    }

}

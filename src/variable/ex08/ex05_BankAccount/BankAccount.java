package variable.ex08.ex05_BankAccount;

public class BankAccount {

    private String accNo;
    private long balance;
    private Bank bank;

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Bank getBank() {
        return this.bank;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccNo() {
        return this.accNo;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void balanceIn(long balance) {
        if (balance <= 0) {
            System.out.println("머함?");
            return;
        }
        this.balance += balance;
    }

    public long balanceOut(long balance) {
        if (balance <= 0 || this.balance < balance) {
            System.out.println("머함?");
            return 0;
        }
        this.balance -= balance;
        return balance;
    }

    public void transfer(BankAccount memBankAcc, long money) {
        memBankAcc.balanceIn(this.balanceOut(money));
    }

    public void info() {
        System.out.println("계좌번호: " + this.accNo + ", 통잔잔액: " + this.balance);
        this.bank.info();
    }

}
package variable.ex08.ex05_BankAccount;

public class BankMember {

  private String memName;
  private BankAccount bankAcc;

  public void setMemName(String memName) {
    this.memName = memName;
  }

  public String getMemName() {
    return this.memName;
  }

  public void setBankAcc(BankAccount bankAcc) {
    this.bankAcc = bankAcc;
  }

  public BankAccount getBankAcc() {
    return this.bankAcc;
  }

  public void balanceIn(long balance) {
    this.bankAcc.balanceIn(balance);
  }

  public long balanceOut(long balance) {
    return this.bankAcc.balanceOut(balance);
  }

  public void transfer(BankMember member, long money) {
    this.bankAcc.transfer(member.bankAcc, money);
  }

  public void info() {
    System.out.println("고객명: " + this.memName);
    this.bankAcc.info();
  }



}

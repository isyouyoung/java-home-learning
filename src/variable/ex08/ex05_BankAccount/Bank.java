package variable.ex08.ex05_BankAccount;

public class Bank {

  private String fAccName;
  private String fTelNo;

  public void setFAccName(String faccName) {
    this.fAccName = faccName;
  }

  public String getFAccName() {
    return this.fAccName;
  }

  public void setFTelNo(String fTelNo) {
    this.fTelNo = fTelNo;
  }

  public String getFTelNo() {
    return this.fTelNo;
  }

  public void info() {
    System.out.println("개설지점: " + fAccName);
  }

}

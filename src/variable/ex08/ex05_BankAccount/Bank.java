package variable.ex08.ex05_BankAccount;

public class Bank {
  private String fAccName;
  private String fAccNo;
  private String fTelNo;
  public Bank(String fAccName, String fAccNo) {
    this.fAccName = fAccName;
    this.fAccNo = fAccNo;
  }
  public Bank() {

  }
  public void info() {
    System.out.println(fAccName + "(" + fAccNo + ")");
    System.out.println();
  }

  public void setFAccName(String fAccName) {
    this.fAccName = fAccName;
  }
  //먼저 이거타서 this에 저장 faccName = 우리은행임
  // bank2도 똑같음

  public void setFTelNo(String fTelNo) {
    this.fTelNo = fTelNo;
  }
  //그담 이거타서 this에 저장 fTelNo = 02-222-2222임!
  // 이것도 2랑 똑같음

  public String getFAccName() {
    return fAccName;
  }
  // 아오 결국 찾았다 ㅋㅋ
  // 한번 찾으니 두번은 할만하네요

  public String getFTelNo() {
    return fTelNo;
  }
  // 요시 바로있네 ㅋㅋ
  // 찾음! 또 마지막에

}

package variable.ex08.ex05_BankAccount;

public class BankMember {
  private String memName;
  private BankAccount bankAcc;
  // 여기고 일단 선언만하고 아무주소값x null임
  public BankMember(String memName, BankAccount bankAcc) {
    this.memName = memName;
    this.bankAcc = bankAcc;
    
  }
  public BankMember() {
    
  }
  public void info() {
    System.out.println("고객명: " + memName);
    bankAcc.info();
  }
  // 입금
  public void balanceIn(long money) {
    bankAcc.balanceIn(money);
  }
  // 뱅크맴버에 발란스인으로 다시 0원 입금 해봤자 0
  
  // 출금
  public long balanceOut(long money) {
    return bankAcc.balanceOut(money);
  }
  // 일단 이거부터 되네  long money로 10000
  // 받음 근대 void가 없으니까 return 하는건 알겠는대 그럼 그냥 다시 10000
  // 반환하는거아닌가 이코드를 이해를 못하곘네
  // bankAcc는 BankMember가 갖고 있는 BankAccount 객체를 가리키는 참조 변수예요??
  // 찾아보는중
  // 아 결국 이것도 따라가야하겠네
  //   private BankAccount bankAcc; 위에 이걸로
  // bankAcc가 BankAccount의 객체 주소를 가지고 있으니까
  // .연산자로 실제 객체로 이동하여 메소드실행 ㅋㅋ 아 ㅋ
  // 반환받은것을 또 return

  
  
  
  // 이체
  
  public void transfer(BankMember bankMem, long money) {
    bankMem.balanceIn(balanceOut(money));
    // 뱅크맴버 클래스로 잘 받았는대 bankMem은 이름인듯그냥
    // 맞다고함 아무거나 바꿀수있고 balanceIn찾으면 됨
    // 10000이였는대 출금 10000했으니까 0
  }
  
  
  
  
  public void setMemName(String memName) {
    this.memName = memName;
  }
  // 오케이 여기로와서 이름 저장!

  public void setBankAcc(BankAccount bankAcc) {
    this.bankAcc = bankAcc;
  }
  // 주소값을 저장했음 acc1객체의 흠 찾아보는중
  // 줭나 어렵다 약간 이해가가는거같기도한대 너무 어려움
  // 오 좀 이해됨

  public BankAccount getBankAcc() {
    return bankAcc;
  }
  // 이거랑1 머야 getAccNo는 없는디?
  // 머야 또이거네

  public String getMemName() {
    return memName;
  }
  // 뭐야 바로 리턴하네 주소값 담겨져있어서 그런가 acc1에
  // 그럼 아까 저장한 이름 출력
  // this.memName으로 저장했었으니까 (객체에) 그대로 반환

}

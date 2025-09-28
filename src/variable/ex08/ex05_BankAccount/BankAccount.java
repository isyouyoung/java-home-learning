package variable.ex08.ex05_BankAccount;

public class BankAccount {
  private Bank bank;
  private long balance; 
  private String accNo;
  public BankAccount(Bank bank, String accNo, long balance) {
    this.bank = bank;
    this.balance = balance;
    this.accNo = accNo;
  }
  public BankAccount() {
    
  }
  
  // 입금
 public void balanceIn(long money) {
   if(money <= 0) {
     return;
   }
   balance += money;
 }

 
  // 출금
 public long balanceOut(long money) {
   long retVal = 0;
   if(money > 0 || money <= balance) {
     balance -= money;
     retVal = money;
   }
   return retVal;
 }
 // 이건 당장은 잘 몰라도 계산해서 - 하고
    // 반환한다는정도만 이해
  
 // 이체
 public void transfer(BankAccount bankAcc, long money) {
   bankAcc.balanceIn(balanceOut(money));
 }
  
  
  public void info() {
    System.out.println("계좌번호: " + accNo + ", 통장잔액: " + balance);
    System.out.print("개설지점: ");
    bank.info();
    System.out.println();
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }
  // 이것부터 실행?? 매개변수로 오는대 bank1이였는대
    // 뱅크 클래스는 뭐지 음 아 bank1이 Bank 클래스니까
    // 여기도 Bank 클래스의 bank를 받을수있다 그건가보다
    // 그래서 acc1의 뱅크에 bank1 저장인가보다
    // 이쪽이 좀 어려움 이해가안가는건 아닌대 좀 헷갈린달까
    // ㅇㅋ 저장 bank2 주소 저장


  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  // ACC1의 계좌를 저장했음!
    // acc2도 저장

  public void setBalance(long balance) {
    this.balance = balance;
  }
  // 음 이번엔 여길타서 ACC1에 밸런스에 롱타입으로 받은 10000을 저장!
    // 이것도 저장
  
  public long getBalance() {
    return balance;
  }
  // 오키 이거실행임 getBalance로 balance 반환임
    // 발란스가 그전에 어캐 저장됬는지 확인해보자

  public String getAccNo() {
    return accNo;
  }
  // 뭐야 갑자기 여기서 나오노...?
    // 설마 방금 뭐 이었다해서 써도되는건가 찾아보자
    // 오케이 찾았다 이거 실행임


  public Bank getBank() {
    return bank;
  }

}

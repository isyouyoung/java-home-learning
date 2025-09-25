package variable.ex08.ex01_BankAccount;

/**
 *  입금, 출금, 계좌조회, 이체기능
 *  @author 김예가
 *  @since 2023.07.19
 *  @version 1.0.0
 */
public class BankAccount {

  /**
   *  String accNo 이 필드는 계좌 번호이다.
   *  초깃값으로 null 저장.
   */
  private String accNo;
  /**
   *  long balance 이 필드는 계좌 잔액이다.
   *  초깃값으로 0 저장.
   */
  private long balance;

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  /**
   * 입금 메소드<br>
   *  파라미터가 0보다 작거나 같으면 동작하지 않는다.
//   * @param money 입금할 금액
   */
  public void balanceIn(long balance) {
    this.balance += balance;
  }
  /**
   * 출금 메소드<br>
   * 파라미터가 0보다 작거나 같으면 동작하지 않는다.
   * 파라미터가 통장잔액보다 크면 출금된 금액이 없으므로 0 반환
   * @param money 출금할 금액
   * @return 실제로 출금하는 금액
   */
  public long balanceOut(long money) {
    this.balance -= money;
    return money;
  }
  /**
   * 계좌번호와 통장잔액을 조회하는 메소드
   */
  public void inquiry() {
    System.out.println("계좌번호: " + accNo);
    System.out.println("통장잔액: " + balance);
  }
  /**
   *  이체 메소드<br>
   *  다른 계좌로 이체하는 메소드
   *  내 계좌 출금 --> 상대 계좌 입금
   * @param you 이체할 계좌명
   * @param money 이체할 금액
   */
  public void transfer(BankAccount you, long money){
    this.balanceOut(money);
    you.balanceIn(money);
  }
}


 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 //                                                                                                               //
 // 필드는 private                                                                                                 //
 // 메서드는 public 고정임!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                    //
 //                                                                                                               //
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


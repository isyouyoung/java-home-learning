package variable.ex08.ex08_Bakery;


// 1가지 빵만 파는 빵집

// 메인에선 호출하지 않음
// sell 메서드 필요 호출하진 않음
// void 해서

public class Bakery {

  private int money;
  private int count;
  private final int PRICE = 2000;

  public void setMoney(int money) {
    this.money = money;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getMoney() {
    return this.money;
  }

  public int getCount() {
    return this.count;
  }

  public Bakery(int count, int money) {
    this.count = count;
    this.money = money;
  }

}

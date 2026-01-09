package variable.ex08.ex08_Bakery;

public class Customer {

  private int money;
  private int count;
  private Bakery bakery;

  public void setMoney(int money) {
    this.money = money;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public void setBakery(Bakery bakery) {
    this.bakery = bakery;
  }

  public int getMoney() {
    return this.money;
  }

  public int getCount() {
    return this.count;
  }

  public Bakery getBakery() {
    return this.bakery;
  }

  public Customer(int money) {
    this.money = money;
  }

  public void buy(Bakery bakery, int money) {

    if(this.money < money) {
      System.out.println("돈부족");
      return;
    }
    int buyCount = money / bakery.getPRICE();
    int change = money % bakery.getPRICE();
    if( bakery.getCount() < buyCount) {
      System.out.println("빵부족");
      return;
    }
    this.money -= money - change;
    this.count += buyCount;
    bakery.sell(buyCount);
    
  }
}

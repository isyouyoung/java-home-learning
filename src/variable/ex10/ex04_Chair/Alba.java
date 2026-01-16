package variable.ex10.ex04_Chair;

public class Alba extends Student {

  private String shopName;

  public Alba (String name, String school, String shopName) {
    super(name, school);
    this.shopName = shopName;
  }

  @Override
  public void info() {
    super.info();
    System.out.println("일하는곳: " + shopName);
  }

}
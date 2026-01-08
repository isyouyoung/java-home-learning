package variable.ex08.ex07_Car;

public class Car {

  private Driver driver;
  private int fuel;
  private int speed;
  private final int MAX_SPEED = 100;

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public Driver getDriver() {
    return this.driver;
  }

  public int getFuel() {
    return this.fuel;
  }

  public int getSpeed() {
    return this.speed;
  }

  public void engineStart() {
    if (this.fuel > 0) {
      System.out.println("시동이 걸렸습니다.");
    } else {
      System.out.println("시동이 걸리지 않았습니다.");
    }
  }

  public void drive() {
    if (this.speed == 0) {
      System.out.println("자동차가 움직이지 않았습니다.");
    } else {
      System.out.println("자동차가 움직였습니다.");
    }
  }

  public void accel(int speed) {
    for (int i = 0; i < speed; i++ ) {
      if (this.speed == MAX_SPEED || fuel == 0) {
        return;
      }
      this.speed++;
      this.fuel--;
    }
  }

  public void brake(int speed) {
    for (int i = 0; i < speed; i++ ) {
      if (this.speed == 0) {
        System.out.println("현재 속도는 " + this.speed + "입니다.");
        return;
      }
      this.speed--;
    }
    System.out.println("현재 속도는 " + this.speed + "입니다.");
  }

}

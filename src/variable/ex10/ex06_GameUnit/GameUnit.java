package variable.ex10.ex06_GameUnit;

public class GameUnit {

  private int hp;
  private String name;
  private boolean isAlive;

  public void setHp(int hp) {
    this.hp = hp;
    this.isAlive = this.hp > 0;
  }

  public int getHp() {
    return this.hp;
  }

  public GameUnit() {

  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public GameUnit(String name) {
    this.name = name;
  }

  public boolean isAlive() {
    return this.isAlive;
  }

  public void attack(GameUnit unit) {

  }

}

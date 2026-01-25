package variable.ex10.ex06_GameUnit;

public class Firebat extends GameUnit {
  private final int POWER = 10;

  public Firebat(String name) {
    super(name);
  }

  @Override
  public void attack(GameUnit unit) {
    System.out.println(getName() + "의 공격!");
    int mrhp = unit.getHp();
    mrhp -= this.POWER;
    if (mrhp <0) {
      mrhp = 0;
    }
    unit.setHp(mrhp);
  }


}

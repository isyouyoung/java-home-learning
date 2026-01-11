package variable.ex08.ex03_Soldier;

public class Gun {

  // 필드
  private int bullet;
  private final int MAX_BULLET = 50;

  // 생성자
  public Gun() {
    System.out.println("총이지롱");
  }
  public Gun(int bullet) {
    this.bullet = (bullet > MAX_BULLET) ? MAX_BULLET : bullet;
  }


  // 메서드
  public void reload(int bullet){
    if (this.bullet + bullet > MAX_BULLET) {
      System.out.println(bullet + "발 장전 불가능!");
    } else {
      this.bullet += bullet;
      System.out.println(bullet + "발이 장전되었습니다. 현재 " + this.bullet + "발이 들어있습니다.");
    }
  }

  public void shoot() {
    if (this.bullet == 0) {
      System.out.println("헛빵");
      return;
    }
    this.bullet--;
    System.out.println("빵! 현재 " + this.bullet + "발 남았습니다");
  }
}
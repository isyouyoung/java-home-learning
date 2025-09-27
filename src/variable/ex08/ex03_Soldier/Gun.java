package variable.ex08.ex03_Soldier;

public class Gun {
  
  private int bullet;
  private final int MAX_BULLET = 50;
  // 최대 50발임
  
  public Gun(int bullet) {
    // 이거부터 실행
    this.bullet =  bullet > MAX_BULLET ? MAX_BULLET : bullet; 
    // 맥스보다 크면 맥스 아니면 실제넣은 총알개수
  }
  
  public void reload(int bullet) {
    if(this.bullet + bullet > MAX_BULLET) {
      // 현재 실제 총알 30발 + 받은 30발이 맥스보다 크면 장전불가능 출력
      // 장전 불가능 출력되곘지? 그담 리턴
      System.out.println(bullet + "발 장전 불가능!");
      return;
    }
    this.bullet += bullet;
    // 그게아니라면 50발보다 같거나 작다면 더함
    System.out.println(bullet + "발이 장전되었습니다. 현재 " + this.bullet + "발이 들어있습니다.");
    //ㅇㅋ
  }
  public void shoot() {
    if(bullet == 0) {
      System.out.println("헛빵!"); // 0이면 헛빵 출력후 종료
      return;
    }
    bullet--;
    System.out.println("빵! 현재 " + bullet + "발 남았습니다.");
    // 아니라면 쏘고 현재 몇발 남았는지 출력
  }
  

  // 왜 잔디 안되지 확인중1
}

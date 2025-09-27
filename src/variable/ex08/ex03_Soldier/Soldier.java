package variable.ex08.ex03_Soldier;

public class Soldier {
  private Gun gun;
  // 이거 중요 Gun클래스의 타입!!임 타입으로 gun 생성 null 임 현재
  
  
  public Soldier(int bullet) {
    // 30받았으니 매개변수로
    gun = new Gun(bullet);
    // 이제 객체 생성함 30 넣어서 gun에 저장
  }
  public void reload(int bullet) {
    // 재장전할건대 처음엔 30발 넣음
    gun.reload(bullet);
    // 실제 건에서 리로드 찾아서 30발 넣음
  }
  public void shoot() {
    gun.shoot(); // 쏨
  }
  
  // 마지막 잔디확인
  
}

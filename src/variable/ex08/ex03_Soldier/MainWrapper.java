package variable.ex08.ex03_Soldier;

public class MainWrapper {

  public static void main(String[] args) {

   Soldier s = new Soldier(30);
   // s = Solier  클래스로 만든 객체임 근대 매개변수로 bullet 30을 줌

   s.reload(30); //ㅇㅋ
   s.reload(20); //ㅇㅋ
   
   for(int n = 0; n < 50; n++) {
     s.shoot(); //50발 쏨
   }
   s.shoot();
   s.shoot();
  }
  // 잔디 이제되네 2

}

package variable.ex10.ex03_Rectangle;

public class MainWrapper {

  public static void main(String[] args) {
    Rectangle s1 = new Rectangle();
    s1.setWidth(5);
    s1.setHeight(5);
    s1.info();
    
    Square s2 = new Square(5);
    s2.info();
    
  }

}
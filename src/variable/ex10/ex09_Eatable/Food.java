package variable.ex10.ex09_Eatable;

public class Food extends Person{

  private String name;

  public Food() {
  }

  public Food(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Food [name=" + this.name + "]";
  }

}

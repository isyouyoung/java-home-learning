package variable.ex08.ex09_Family;

public class Family{

  private Person[] family;
  private int familyCount;

  public void setFamily(Person[] family) {
    this.family = family;
  }

  public Person[] getFamily() {
    return this.family;
  }

  public Family(int familyCount) {
    this.family = new Person[familyCount];
    this.familyCount = familyCount;
  }

}

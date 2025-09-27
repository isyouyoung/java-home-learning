package variable.ex08.ex04_Singer;

public class Singer {
  private Song titleSong;
  private String name;
  
  public Singer() {
    titleSong = new Song();
  }

  public void setTitleSong(Song titleSong) {
    this.titleSong = titleSong;
  }

  public void Name() {
    System.out.println("이름: " + name);
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void info() {
    Name();
    titleSong.info();
    // 인포 실행하러왔더니
    // 또 타이틀송안에 info네?? 근대 titleSong은 Song 타입이니까
    // Song안에 info 겠네?
    
  }
}

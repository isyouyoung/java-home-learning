package variable.ex08.ex04_Singer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainWrapper {

  public static void main(String[] args) {

    Song song = new Song();
    //Song 클래스 타입의 song 생성 매개변수 x
    song.setTitle("홀로");
    // set타이틀에 홀로 들어감  아 타이틀에 ㅇㅇ
    song.setGenre("발라드");
    // 이건 그럼 장르에 발라드 들어갔네
    song.setPlayTime(3.5);
    // 플레이타임엔 3.5 저장됨
    song.info();
    // 인포가 3개 출력이라 출력함 3개 정보
    Singer singer = new Singer();
    // 이번엔 Singer 타입의 singer 생성해서 저장 이번에도 매개변수 x
    singer.setName("이하이");
    // name에 이하이 저장
    singer.setTitleSong(song);
    // 타이틀송 저장
    singer.info();
    // singer안에 info 실행
  }

}

package variable.ex08.ex02_Watch;

/**
 *  시, 분, 초 정보를 가지고 있는 시계 클래스
 *  addHour, addMinute, addSecond 메소드를 이용해서 시, 분, 초를 조작할 수 있다.
 * @author 김예가
 * @since 2023.07.20
 * @version 1.0
 */
public class Watch {

  private int hour;
  private int minute;
  private int second;

  // 조회용 함수 추가
  public String checkTime () {
    return this.hour + ":" + this.minute + ":" + this.second;
  }

  /**
   * 시간 정보를 저장하는 필드. 0 ~ 23 사이의 값
   */
  public void setHour (int hour) {
    this.hour = hour;
  }

  /**
   * 분 정보를 저장하는 필드. 0 ~ 59 사이의 값
   */
  public void setMinute (int minute) { this.minute = minute; };

  /**
   * 초 정보를 저장하는 필드. 0 ~ 59 사이의 값
   */
  public void setSecond (int second) { this.second = second; };

  /**
   *  필드 hour에 파라미터 param을 더하는 메소드<br>
   *  필드 hour값은 0 ~ 23사이의 값을 가질 수 있도록 처리해야 한다.
   *  파라미터 값이 0이하이면 처리하지 않는다.
   * @param hour 증가시킬 시간 정보
   */
  public void addHour (int hour) {
    this.hour += hour;
    if (this.hour > 23) {
      this.hour %= 24;
    }
  }


  /**
   *  필드 minute에 파라미터 param을 더하는 메소드<br>
   *  필드 minute값은 0 ~ 60사이의 값을 가질 수 있도록 처리해야 한다.<br>
   *  필드 minute값이 60이상이면 필드 hour 값도 증가시켜야 한다.<br>
   *  파라미터 값이 0이하이면 처리하지 않는다.
   *  @param minute 증가시킬 분 정보
   */
  public void addMinute (int minute) {
    this.minute += minute;
    if (this.minute > 59) {
      this.hour += this.minute / 60;
      this.minute %= 60;
      System.out.println("디스미닛 = " + this.minute);
    }
  }

  /**
   *  필드 second에 파라미터 param을 더하는 메소드<br>
   *  필드 second값은 0 ~ 60사이의 값을 가질 수 있도록 처리해야 한다.<br>
   *  필드 second값이 60이상이면 필드 minute 값도 증가시켜야 한다.<br>
   *  파라미터 값이 0이하이면 처리하지 않는다.
   * @param addSecond 증가시킬 초 정보
   */
  public void addSecond (int second) {
    if (second > 59) {
      this.minute += second / 60;
      System.out.println("디스세컨드 = " + this.minute);
    }
  }


  public int getHour () {
    return this.hour;
  }

  public int getMinute () {
    return this.minute;
  }

  public int getSecond () {
    return this.second;
  }



}


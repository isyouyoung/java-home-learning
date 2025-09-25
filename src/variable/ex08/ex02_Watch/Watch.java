package variable.ex08.ex02_Watch;

/**
 *  시, 분, 초 정보를 가지고 있는 시계 클래스
 *  addHour, addMinute, addSecond 메소드를 이용해서 시, 분, 초를 조작할 수 있다.
 * @author 김예가
 * @since 2023.07.20
 * @version 1.0
 */
public class Watch {
  /**
   * 시간 정보를 저장하는 필드. 0 ~ 23 사이의 값
   */
  private int hour;

  /**
   * 분 정보를 저장하는 필드. 0 ~ 59 사이의 값
   */
  private int minute;

  /**
   * 초 정보를 저장하는 필드. 0 ~ 59 사이의 값
   */
  private int second;

  public void setHour (int hour) {
    this.hour = hour;
  }

  public int getHour () {
    return this.hour;
  }

  /**
   *  필드 hour에 파라미터 param을 더하는 메소드<br>
   *  필드 hour값은 0 ~ 23사이의 값을 가질 수 있도록 처리해야 한다.
   *  파라미터 값이 0이하이면 처리하지 않는다.
   * @param param 증가시킬 시간 정보
   */
  public void addHour (int hour) {
    this.hour += hour;
  }


  /**
   *  필드 minute에 파라미터 param을 더하는 메소드<br>
   *  필드 minute값은 0 ~ 60사이의 값을 가질 수 있도록 처리해야 한다.<br>
   *  필드 minute값이 60이상이면 필드 hour 값도 증가시켜야 한다.<br>
   *  파라미터 값이 0이하이면 처리하지 않는다.
   * @param param 증가시킬 분 정보
   */
  public void addMinute (int minute) {
    if (this.minute > 59) {
      hour += minute / 60;
        minute %= 60;
    }
  }

  /**
   *  필드 second에 파라미터 param을 더하는 메소드<br>
   *  필드 second값은 0 ~ 60사이의 값을 가질 수 있도록 처리해야 한다.<br>
   *  필드 second값이 60이상이면 필드 minute 값도 증가시켜야 한다.<br>
   *  파라미터 값이 0이하이면 처리하지 않는다.
   * @param param 증가시킬 초 정보
   */
  public void addSecond (int second) {
    if (this.second > 59) {
      hour += second / 60;
    }
  }

  public int getMinute () {
    this.minute = this.hour * 60 + this.minute;
    return this.minute;
  }

  public int getSecond () {
    this.second = this.hour * 60 + this.second;
    return this.second;
  }
}

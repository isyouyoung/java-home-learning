package variable.ex08.ex06_Member;

public class Address {

  private String postCode;
  private String roadAddr;
  private String jibunAddr;
  private String detailAddr;

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public void setRoadAddr(String roadAddr) {
    this.roadAddr = roadAddr;
  }

  public void setJibunAddr(String jibunAddr) {
    this.jibunAddr = jibunAddr;
  }

  public void setDetailAddr(String detailAddr) {
    this.detailAddr = detailAddr;
  }

  public String getPostCode() {
    return this.postCode;
  }

  public String getRoadAddr() {
    return this.roadAddr;
  }

  public String getJibunAddr() {
    return this.jibunAddr;
  }

  public String getDetailAddr() {
    return this.detailAddr;
  }

}
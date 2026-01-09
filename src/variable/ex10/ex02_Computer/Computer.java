package variable.ex10.ex02_Computer;

public class Computer {

    // 필드
    private String model;

    // 생성자
    public Computer(){
    }
    public Computer(String model){
        this.model = model;
    }

    // 메서드
    public String getModel(){
        return this.model;
    }

}

package variable;

public class VariableEX02 {
    public static void ex01() {
        //점수에 따른 학점(if문)
        int score = 35;
        char grade = 0;  // 'A = 80', 'B = 60', 'C = 40', 'D = 20', 'F'
        if (score >= 80 && score <= 100) {
            grade = 'A';
        } else if (score >= 60) {
            grade = 'B';
        } else if (score >= 40) {
            grade = 'C';
        } else if (score >= 20) {
            grade = 'D';
        } else if (score >= 0) {
            grade = 'F';
        } else grade = 'X';

        if (grade == 'X') {
            System.out.println("학점이 없습니다");
        } else {System.out.println(score + "점은 " + grade + "학점 입니다.");}
    }

    public static void ex02() {
        //점수에 따른 학점(switch문)
        int score = 0;
        char grade = 0;  // 'A', 'B', 'C', 'D', 'F'

        switch (score / 20) {
            case 5, 4: grade = 'A'; break;
            case 3:    grade = 'B'; break;
            case 2:    grade = 'C'; break;
            case 1:    grade = 'D'; break;
            case 0:    grade = 'F'; break;
        }
        System.out.println(score + "점수는 " + grade + "학점입니다.");
    }

    public static void ex03() {
        //점수와 학년에 따른 학점
        //1~3학년 : 60점 이상 합격, 아니면 불합격
        //4~6학년 : 70점 이상 합격, 아니면 불합격
        int score = 59; // 점수
        int scYear = 1;  // 학년
        String pass = "";  // "합격", "불합격"
        if (scYear <= 3) {
            if (score >= 60) {
                pass = "| 합격";
            } else pass = "| 불합격";
        }
        else {
            if (score >= 70) {
                pass = "| 합격";
            } else pass = "| 불합격";
        }
        System.out.println(scYear + "학년 " + score + "점 " + pass);
    }

    public static void ex04() {
        //메뉴에 따른 가격
        //아메리카노 : 2000
        //카페라떼 : 2500
        //밀크티 : 3000
        //기타 : 5000
        String order = "아메리카노";
        int price = 0;
        if (order.equals("아메리카노")) {
            price = 2000;
        } else if (order.equals("카페라떼")) {
            price = 2500;
        } else if (order.equals("밀크티")) {
            price = 3000;
        } else price = 5000;
        order = "기타";
        System.out.println("주문하신 " + order + "는(은) : " + price + "원입니다.");
    } // 수정필요

    public static void ex05() {
        //월에 따른 계절
        //3 ~ 5 : 봄
        //6 ~ 8 : 여름
        //9 ~ 11: 가을
        //12 ~ 2: 겨울
        int month = 7;
        String season = "";  // "봄", "여름", "가을", "겨울"


        System.out.println(month + "월은 " + season + " 계절");
    }

    public static void ex06() {
        //월에 따른 분기
        //1 ~ 3 : 1분기
        //4 ~ 6 : 2분기
        //7 ~ 9 : 3분기
        //10 ~ 12 : 4분기
        int m = 12;
        int s = 0;


        System.out.println(m + "월은 " + s + "분기");
    }

    public static void ex07() {
        //10일 후 요일은?
        int day = 1;    // 현재 일수
        int nDay = 10;  // 지날 일수
        int ncDay = 0;  // 지난 일수
        ncDay = day + nDay;

        String weekname = "";   // 요일                 // "월", "화", "수", "목", "금", "토", "일"
        int month = 7;          // 현재 달수
        int maxDay  = 0;        // 현재 달의 최대 일수
        int year  = 2023;       // 현재 년도

        System.out.println( nDay + "일후 요일은 " + month + "월 " + ncDay + "일 " + weekname + "요일");
    }

    public static void ex08() {
        // 아스키 코드
//    대문자 -> 소문자, 소문자 -> 대문자
        char ch = 'a';


        System.out.println(ch);
    }

    public static void main(String[] args) {
//    ex01();
//    ex02();
        ex03();
//    ex04();
//    ex05();
//    ex06();
//    ex07();
//        ex08();
    }
}

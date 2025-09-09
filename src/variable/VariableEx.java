package variable;

public class VariableEx {

    public static void main(String[] args) {
        // 초 -> 분/초
        int second = 90;
        int m = 90/60;  // <= 몫만 나오는식 필요
        int s = 90%60;     // <= 나머지만 나오는식 필요
        System.out.println("분/초 : " + m + "/" + s);

        // x와 y값을 교환
        int x = 10;
        int y = 20;
        int z = 0;
        z = y;
        y = x;
        x = z;
        System.out.println("x : " + x);
        System.out.println("y : " + y);

	    // 5% 이자는 얼마?(소수 이하는 버림)
        long balance = 123456L;  // 통장잔액
        double pct = 0.05;  // 5%
        double result = 0;
        int Inter = 0;
//        Inter = (int)balance + ((int)balance*(int)pct);
        result = balance * ++pct;
        Inter = (int)result;
        System.out.println("5% 이자후 통장잔액 : " + Inter);

//        long inter = (long)++pct * balance;		// pct타입이 double로 안맞기때문에 강제타입 변환시켜줘야 한다.
//        int Inter = (int)inter;
//        System.out.println("5% 이자후 통장잔액 : " + Inter);


//	    // 90점대 점수이면 true, 아니면 false
        int score1 = 95;
        int score2 = 75;

        boolean TrFa1 = (score1 != 100) && (score1 >= 90);
        boolean TrFa2 = (score2 != 100) && (score2 >= 90);
        System.out.println("90점대 점수 여부:" + TrFa1);
        System.out.println("90점대 점수 여부:" + TrFa2);


//	    // n의 "짝수", "홀수" 여부 출력
        int n = 21;
        String result2 = (n % 2 != 0) ? "홀수" : "짝수";
        System.out.println("숫자의 짝수홀수 여부 : " + result2);

//	    // num의 "짝수", "홀수", "3의배수" 여부 출력
        int num = 99;
        String res2 = (num % 2 != 0) ? "홀수" : "짝수";
        String res3 = (num % 3 != 0) ? "3의 배수가 아닌것" : "3의 배수";
        String res4 = (num % 3 != 0) ? (num % 2 != 0) ? "홀수" : "짝수" : "3의 배수";

        System.out.println("숫자 "+ num + "은(는) " + res2 + "입니다.");
        System.out.println("숫자 "+ num + "은(는) " + res3 + "입니다.");
        // 0의 배수도 고려해서 만든다.

        System.out.println(res4);
//        3의 배수면 3의 배수 출력
//                3의 배수가 아니면 그중에 짝수면 짝수출력 홀수면 홀수출력
    }
}

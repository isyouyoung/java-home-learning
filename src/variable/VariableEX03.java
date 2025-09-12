package variable;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class VariableEX03 {
    public static void ex01() {
        // 구구단 출력하기
        // 2 x 1 = 2
        // 2 x 2 = 4
        // ...
        // 2 x 9 = 18
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 구구단 숫자를 입력하세요");
        int dan = sc.nextInt();
        int i;
        System.out.println("구구단 출력하기");
        for (i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }

    public static void ex02() {
        // 100000 넘을 때까지 60원씩 모금하면서 과정 출력하기
        // 1회 모금액 60원, 현재 모금액 60원
        // 2회 모금액 60원, 현재 모금액 120원
        // 3회 모금액 60원, 현재 모금액 180원
        // ...
        // 1667회 모금액 60원, 현재 모금액 100020원
        final int GOAL = 100000;  // 목표 모금액
        int money = 60;  // 1회당 모금액
        int total = 0;  // 모금액 합계
        int nth = 0;  // 회차

        System.out.println("100000 넣을 때까지 60원식 모금하면서 과정 출력하기");
        for (nth = 1; total < GOAL; nth++) {
            total = money * nth;
            System.out.println(nth + "회 모금액" + money +"원, 현재 모금액 " + total + "원");
        }
    }

    public static void ex03() {
        // 전체 구구단 출력하기 - 1
        // --- 2단 ---
        // 2 x 1 = 2
        // ...
        // 9 x 9 = 81
        // 고정 값 : 바깥 LOOP에 배치
        int i,j = 0;
        System.out.println("전체 구구단 출력하기");
        for (i = 2; i <= 9; i++) {
            System.out.println("\n구구단" + i + " 단 시작");
            for (j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

    public static void ex04() {
        // 전체 구구단 출력하기 - 2
        // 2x1=2  3x1=3  4x1=4  ... 9x1=9
        // ...
        // 2x9=18 3x9=27 4x9=36 ... 9x9=81

        // 참고할코드
//  System.out.print("2x1=2");  // 2x1=2를 출력한 뒤 줄을 바꾸지 않는다.
        int dan = 2;
        for (dan = 2; dan <= 9; dan++) {
            for (int j = 0; j < 9; j++) {
                int z = 1;
                System.out.print(dan + j + "x" + z + "=" + dan * (j + 1) + " ");
            }
            System.out.println();
        }

//  String.format
//  ("%nd", 숫자) %d는 정수, n이 양수이면 숫자 나중에 출력, 음수이면 먼저 출력
//  정해진 칸수를 맞춘다.
    }

    public static void ex05() {
        // 삼각별 출력하기 - 1 (2중 loop)
        // *
        // **
        // ***
        // ****
        // *****

        // 참고할 코드
//  System.out.print("*");  // *를 출력한 뒤 줄을 바꾸지 않는다.
//  System.out.println();   // 줄 바꾸기
        int num = 5;


    }

    public static void ex06() {
        // 삼각별 출력하기 - 2 (2중 loop)
        // *****
        // ****
        // ***
        // **
        // *
        int num = 5;

    }

    public static void ex07() {
        // 삼각별 출력하기 - 3 (2중 loop)
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        int num = 20;

    }

    public static void ex08() {
        // 삼각별 출력하기 - 4 (2중 loop)
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        int num = 5;


    }

    public static void ex09() {
        // 삼각별 출력하기 - 3 (2중 loop)
        //              *
        //             ***
        //            *****
        //             ***
        //            *****
        //           *******
        //          *********
        //           *******
        //          *********
        //         ***********
        //        *************
        //       ***************
        //
        // 행 1  = 1 개
        // 행 2  = 3 개
        // 행 3  = 5 개
        // 행 4  = 3 개
        // 행 5  = 5 개
        // 행 6  = 7 개
        // 행 7  = 9 개
        // 행 8  = 7 개
        // 행 9  = 9 개
        // 행 10 = 11개
        // 행 11 = 13개
        // 행 12 = 15개
        int num = 5;

    }

    public static void ex10() {
        // 삼각별 출력하기 - 3 (2중 loop)
        //   *
        // * * * *                  // 1일때
        //   *
        //     *
        //   * * * * *
        // * * * * * *              // 2일때
        //   * * * * *
        //     *
        //
        //       *
        //     * * * * * *
        //   * * * * * * *
        // * * * * * * * *         // 3일때
        //   * * * * * * *
        //     * * * * * *
        //       *
        //
        int num = 5;


    }



    public static void main(String[] args) {
//  ex01();
//  ex02();
//  ex03();
  ex04();
//  ex05();
//  ex06();
//  ex07();
//        ex08();
//  ex09();

    }
}

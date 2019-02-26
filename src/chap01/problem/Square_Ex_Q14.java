package chap01.problem;

import java.util.Scanner;

/**
 * 연습문제 Q14. 오른쪽과 같이 입력한 수를 한 변으로 하는 정사각형을 * 기호로
 * 출력하는 프로그램을 작성하세요.
 */
public class Square_Ex_Q14 {
    public static void main(String[] args) {
        System.out.println("사각형을 출력합니다.");
        Scanner stdIn = new Scanner(System.in);

        System.out.print("단 수 : ");
        int dan = stdIn.nextInt();

        for(int i = 0; i < dan; i++) {
            for(int j = 0; j < dan; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        stdIn.close();
    }
}

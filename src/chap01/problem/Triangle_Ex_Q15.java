package chap01.problem;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 연습문제 Q15. 직각 이등변 삼각형을 출력하는 부분을
 * 아래와 같은 형식의 메서드로 작성하세요.
 */
public class Triangle_Ex_Q15 {
    static void triangleLB(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {

    }

    public static void main(String[] args) {
        System.out.println("이등변 삼각형을 출력합니다.");

        Scanner stdIn = new Scanner(System.in);
        int dan;

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            dan = stdIn.nextInt();
        } while(dan <= 0);

        //triangleLB(dan);
        //triangleLU(dan);
        triangleRU(dan);
        //triangleRB(dan);
    }


}

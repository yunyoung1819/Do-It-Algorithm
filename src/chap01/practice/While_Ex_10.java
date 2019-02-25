package chap01.practice;

import java.util.Scanner;

/**
 * 오른쪽과 같이 두 변수 a,b에 정수를 입력하고 b-a를
 * 출력하는 프로그램을 작성하세요.
 * 단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요.
 */
class While_Ex_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();

        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();

        while(b <= a) {
            System.out.println("a보다 큰 값을 입력하세요.");
            System.out.print("b의 값 : ");
            b = stdIn.nextInt();
        }

        System.out.println("b - a는 " + (b - a) + "입니다.");
        stdIn.close();
    }
}

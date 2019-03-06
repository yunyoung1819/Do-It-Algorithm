package chap02.problem;

import java.util.Scanner;

/**
 * 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
 */
public class Ex_Q3 {
    static int sum = 0;
    // 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드
    static int sumOf(int[] a) {
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++) {
            x[i] = stdIn.nextInt();
        }

        for(int arr : x) {
            System.out.print(arr + " ");
        }
        System.out.println();
        System.out.println("전 요소의 합계는 " + sumOf(x) + "입니다.");
        stdIn.close();
    }
}

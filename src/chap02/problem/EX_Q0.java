package chap02.problem;

import java.util.Scanner;

/**
 * 배열 요소를 역순으로 정렬하기
 */
public class EX_Q0 {

    static void reverse(int[]a) {
        for(int i = 0; i < a.length/2; i++) {
            swap(a, i, a.length-1-i);
        }
    }

    static void swap(int[]a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 요솟수 입력 : ");

        int na = stdIn.nextInt();
        int[] a = new int[na];

        for (int i = 0; i < a.length; i++) {
            a[i] = stdIn.nextInt();
        }

        reverse(a);

        System.out.println("배열을 역순으로 정렬하였습니다.");

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
    }
}

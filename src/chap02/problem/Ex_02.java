package chap02.problem;

import java.util.Scanner;

/**
 * 연습문제 Q2.오른쪽처럼 배열 요소를 역순으로 정렬하는 과정을
 * 하나하나 나타내는 프로그램을 작성하세요.
 */
public class Ex_02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < x.length; i++) {
            x[i] = stdIn.nextInt();
        }

        printArr(x);
        reverse(x);

        System.out.println("역순 정렬을 마쳤습니다.");
        stdIn.close();
    }

    private static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void reverse(int[] a) {
        for(int i = 0; i < a.length/2; i++) {
            System.out.println("a[" + i + "]과(와) a[" + (a.length - 1 - i) + "]를 교환합니다.");
            swap(a, i, a.length-i-1);
            printArr(a);
        }
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }


}

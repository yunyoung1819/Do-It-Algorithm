package chap03.problem;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 연습문제 Q6. 실습 3-5를 수정하여 검색에 실패하면 삽입 포인트의 값을
 * 출력하는 프로그램을 작성하세요.
 */
class BinarySearch_Ex_Q6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if(idx < 0) {
            int insPoint = -idx -1;
            System.out.println("그 값의 요소가 없습니다.");
            System.out.printf("삽입 포인트는 %d입니다.\n", insPoint);
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}

package chap03.problem;

import java.util.Scanner;

/**
 * 선형 검색
 */
public class LinearSearch {

    static int linearSearch(int[] a, int num, int key) {
        for(int i = 0; i < num; i++) {
            if(key == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열의 요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 값 : ");
        int key = stdIn.nextInt();
        int idx = linearSearch(x, num, key);

        if(idx == -1) {
            System.out.println("검색 실패");
        }else{
            System.out.println("검색 요소는 x[" + idx + "]에 있습니다.");
        }

    }
}

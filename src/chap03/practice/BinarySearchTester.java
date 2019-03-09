package chap03.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays.binarySearch 로 이진 검색
 *
 * Java는 배열에서 이진 검색을 하는 메서드를 표준 라이브러리로 제공합니다.
 * java.util.Arrays 클래스의 binarySearch 메서드가 있습니다.
 */
class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");  // 배열의 첫 요소를 먼저 입력합니다.
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while(x[i] < x[i-1]);  // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값 : ");  // 키 값을 입력받음
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky); // 배열 x에서 키 값이 ky인 요소를 검색

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}

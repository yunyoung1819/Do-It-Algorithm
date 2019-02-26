package chap02.practice;

/**
 * 배열의 복제는 clone 메서드를 호출하여 쉽게 만들 수 있습니다.
 *
 * 배열 이름.clone()
 */
public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.print("a =");
        for(int i = 0; i < a.length; i++)
            System.out.print(" " + a[i]);

        System.out.print("\nb =");
        for(int i = 0; i < b.length; i++)
            System.out.print(" " + b[i]);
    }
}

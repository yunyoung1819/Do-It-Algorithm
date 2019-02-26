package chap01.problem;

/**
 * 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요.
 * Q12와 같이 표의 위쪽과 왼쪽에 더하는 수를 출력하세요.
 */
public class AddTable_Ex_Q13 {
    public static void main(String[] args) {
        System.out.print("   |");
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n---+---------------------------");

        for(int j = 1; j <= 9; j++) {
            System.out.printf("%d", j);
            System.out.print("  |");
            for(int k = 1; k <= 9; k++) {
                System.out.printf("%3d", (j + k));
            }
            System.out.println();
        }
    }
}

package chap01.problem;
import java.util.Scanner;

/**
 * 연습문제 Q9. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여
 * 반환하는 아래 메서드를 작성하세요.
 */
class SumOf_Ex_Q9 {
    static int sumof(int a, int b) {
        int sum = 0;
        if(a <= b){
            for(int i = a; i <= b; i++) {
                sum += i;
            }
        }else{
            for (int j = b; j <= a; j++) {
                sum += j;
            }
        }
        System.out.println("sum : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();

        sumof(a, b);
        stdIn.close();
    }
}

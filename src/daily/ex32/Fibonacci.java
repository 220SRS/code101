package daily.ex32;

import java.util.Scanner;

public class Fibonacci {
    //10870번 피보나치 수 5
    //피보나치 수는 0과 1로 시작한다.
    //0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
    // 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이다.

    // 이를 식으로 하면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

    // n이 주어졌을때, n번째 피보나치 수를 구하는 프로그램을 작성하라
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int result = recursion(num);

        System.out.println(result);
    }

    private static int recursion(int num) {
        if(num == 0) {
            return 0;
        }

        else if (num == 1) {
            return 1;
        }
        return recursion(num-1) + recursion(num-2);
    }
}

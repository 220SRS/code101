package daily.normal.ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorMultiple {
    // 2609번 최대공약수와 최소공배수

    // 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오

    //입력
    // 첫째 줄에는 두 개의 자연수가 주어진다. 한 칸의 공백이 주어진다.
    // 24 18

    //출력
    // 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진
    // 두 수의 최소 공배수를 출력한다.
    // 6
    // 72
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        List<Integer> result = caculater(num1, num2);

        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }

    private static List<Integer> caculater(int num1, int num2) {
        List<Integer> result = new ArrayList<>();

        // 유클리드 호제법
        // a = b * q + r
        if(num1 > num2) {
            int n = num2;
            num2 = num1;
            num1 = n;
        }

        int multiple = num1 * num2;

        while (true) {
            int rem = num2 % num1;
            if (rem == 0) {
                result.add(num1);
                break;
            }
            else {
                num2 = num1;
                num1 = rem;
            }
        }
        result.add(multiple / num1);

        return result;
    }
}
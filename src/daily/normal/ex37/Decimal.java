package daily.normal.ex37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Decimal {
    //2581번 소수

    //문제
    //자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의
    //합과 최솟값을 찾는 프로그램을 작성하시오
    //예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중
    // 소수는 61, 67, 71...
    // 합은 620, 최솟값은 61

    //입력
    //입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
    //M은 N보다 작거나 같다.

    //출력
    //M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그합을, 둘째 줄에 그 중
    //최솟값을 출력한다.
    //단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        boolean[] decimal = new boolean[n+1];
        decimal = sieveOfEratosthenes(m, n);

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (decimal[i]) {
                intArr.add(i);
            }
        }

        if (intArr.size() == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(intArr.stream().mapToInt(s -> s).sum());
        System.out.println(intArr.get(0));

    }

    private static boolean[] sieveOfEratosthenes(int m , int n) {
        boolean[] decimal = new boolean[n+1];

        Arrays.fill(decimal, true);

        decimal[0] = false;
        decimal[1] = false;

        for (int i = 2; i*i < n; i++) {
            if (decimal[i]) {
                for (int j = i * i; j <= n; j += i) {
                    decimal[j] = false;
                }
            }
        }

        return decimal;
    }
}
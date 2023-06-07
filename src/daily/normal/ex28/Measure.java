package daily.normal.ex28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Measure {
    //백준 2501
    // 자연수 p와 q, p를 q로 나눴을때 나머지가 0이면 q는 p의 약수이다.
    // 두 개의 N과 K가 주어졌을때, N의 약수들 중 K번째로 작은 수를 출력
    // N과 K는 빈칸 하나를 두고 주어진다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        List<Integer> measureList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                measureList.add(i);
            }
        }

        if(measureList.size() < k) System.out.println(0);

        else {
            System.out.println(measureList.get(k - 1));
        }
    }

}

package daily.normal.ex30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMax {
    // 백준 10818번 최소, 최대

    //N개의 정수가 주어진다. 이때, 최솟값, 최댓값을 구하는 프로그램을 작성하시오
    // 입력
    // 첫째 줄에 정수의 개수 N, 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.

    // 출력
    // n개의 최솟값과 최댓값을 공백으로 구분해서 출력한다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            numList.add(num);
        }

        List<Integer> minMax = calculator(numList);

        System.out.printf("%d %d", minMax.get(0), minMax.get(1));
    }

    public static List<Integer> calculator (List<Integer> numList) {

            Integer min = numList.stream()
                    .mapToInt(x -> x)
                    .min()
                    .orElseThrow(NoSuchFieldError::new);

            Integer max = numList.stream()
                    .mapToInt(x -> x)
                    .max()
                    .orElseThrow(NoSuchFieldError::new);

        return List.of(min, max);
    }
}

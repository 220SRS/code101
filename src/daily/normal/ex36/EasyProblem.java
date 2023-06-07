package daily.normal.ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasyProblem {
    //1292번 쉽게 푸는 문제

    //문제
    //동호는 내년에 초등학교를 입학한다. 그래서 동호 어머니는 수학 선행 학습을 위해
    // 쉽게 푸는 문제를 동호에게 주었다.
    //1을 한 번, 2를 두 번, 3을 세번, 이런식으로 1 2 2 3 3 3 4 4 4 ... 이러한 수열을 만들고
    //어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.

    //입력
    //첫째 줄에 구간의 시작과 끝을 나타내는 정수 A,B가 주어진다. 즉, 수열에서 A번째 숫자부터 B번째 숫자까지
    //합을 구하면 된다.
    //3 7

    //출력
    //첫 줄에 구간에 속하는 숫자의 합을 출력한다.
    //15
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int result = calculator(start, end);

        System.out.println(result);
    }

    private static int calculator(int start, int end) {
        int sum = 0;
        List<Integer> dataList = new ArrayList<>();

        for(int i=0; i<1000; i++) {
            for(int j = 0; j <= i; j++) {
                dataList.add(i + 1);
            }
        }

        for(int i = start-1; i <= end-1; i++) {
            sum += dataList.get(i);
        }

        return sum;
    }
}

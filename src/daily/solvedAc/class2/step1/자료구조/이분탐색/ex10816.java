package daily.solvedAc.class2.step1.자료구조.이분탐색;
// 숫자 카드 2
// 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
// 정수 M개가 주어졌을때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는
// 프로그램을 구하라
// 입력
// 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N이 주어진다.
// 둘째 줄에 숫자 카드에 적혀있는 정수가 주어진다.
// 셋째 줄에는 M이 주어진다.
// 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야할 M개의 정수가 주어지며,
// 이 수는 공백으로 구분

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class ex10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer stN = new StringTokenizer(bf.readLine());
        int[] nArray = new int[N];
        for (int i = 0; i < N; i++) {
            nArray[i] = Integer.parseInt(stN.nextToken());
        }
        Arrays.sort(nArray);

        int M = Integer.parseInt(bf.readLine());
        StringTokenizer stM = new StringTokenizer(bf.readLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(stM.nextToken());

            result.append(upper(nArray, num) - lower(nArray, num) + " ");
        }
        System.out.println(result);
    }

    private static Integer upper(int[] nArray, int num) {
        int lo = 0;
        int hi = nArray.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (num < nArray[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }


    private static Integer lower(int[] nArray, int num) {
        int lo = 0;
        int hi = nArray.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (num <= nArray[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}

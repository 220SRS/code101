package daily.solvedAc.class2.step1.자료구조.이분탐색;
// 수 찾기
// N개의 정수가 주어진다. 이때, 이 안에 X라는 정수가 존재하는지 알아내시오

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] array = new int[N];
        StringTokenizer stN = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(stN.nextToken());
        }

        Arrays.sort(array);

        int M = Integer.parseInt(bf.readLine());
        StringTokenizer stM = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            int bool = 0;
            int lo = 0;
            int hi = array.length;
            int num = Integer.parseInt(stM.nextToken());
            while (lo < hi) {
            int mid = (hi + lo) / 2;
                if (array[mid] < num) {
                    lo = mid + 1;
                }
                else if (array[mid] > num) {
                    hi = mid;
                }
                else {
                    bool = 1;
                    break;
                }
            }
            System.out.println(bool);
        }
    }
}

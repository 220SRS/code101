package daily.solvedAc.class2.step1.정렬;
// 수 정렬하기 3
// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ex10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int[] arrayInt = new int[10001];
        for (int i = 0; i < T; i++) {
            arrayInt[Integer.parseInt(bf.readLine())] ++;
        }
        bf.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            while (arrayInt[i] > 0) {
                sb.append(i).append('\n');
                arrayInt[i]--;
            }
        }
        System.out.println(sb);
    }
}
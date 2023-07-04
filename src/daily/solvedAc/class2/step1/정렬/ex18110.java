package daily.solvedAc.class2.step1.정렬;
// solved.ac
// 아직 아무 의견이 없다면 문제의 나이도는 0으로 결정
// 의견이 하나 이상 있다면, 문제의 난이도는 모든 사람의 난이도 의견의 30% 절사 평균으로 결정한다
// 전체 갯수에서 위에서 15% 아래에서 15% 만큼 빼고 평균내야함, 반올림 있음

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int[] array = new int[T];
        for (int i = 0; i < T; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        int cut = (int) Math.round(T * 0.15);
        double sum = 0;
        for (int i = cut; i < T - cut; i++) {
            sum += array[i];
        }
        int a = (int) Math.round(sum / (T - cut * 2));
        System.out.println(a);
    }
}
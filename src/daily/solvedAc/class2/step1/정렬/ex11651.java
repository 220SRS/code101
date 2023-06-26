package daily.solvedAc.class2.step1.정렬;
// 좌표 정렬하기 2
// 2차원 평면 위의 점 N개가 주어진다. 좌표를 y 좌표가 증가하는 순으로
// y 좌표가 같으면 x 좌표가 증가하는 순서로 정렬한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ex11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int[][] array = new int[T][2];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }
        });
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
}

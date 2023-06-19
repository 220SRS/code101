package daily.solvedAc.class2.step1.정렬;
// 좌표 정렬하기
// 2차원 평면 위의 점 N개가 주어진다. 좌표를 X좌표가 증가하는 순으로, X좌표가 같으면 Y좌표가 증가하는
// 순서로 정렬한 다음 출력하는 프로그램을 작성하시오

// 입력
// 첫째 줄에 점의 개수 N (1 ~ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다
// (-100,000 ~ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ex11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int[][] inputArray = new int[T][2];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            inputArray[i][0] = Integer.parseInt(st.nextToken());
            inputArray[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(inputArray, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                else {
                    return o1[0] - o2[0];
                }
            }
        });

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i][0] + " " + inputArray[i][1]);
        }

    }
}

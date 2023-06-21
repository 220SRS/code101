package daily.solvedAc.class2.step1.브루트포스;
// 체스판 다시 칠하기
// 지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 MxN 크기의 보드를 찾았다.
// 어떤 정사각형은 검은색, 나머지는 흰색, 이보드를 잘라서 체스판으로 만든다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1018 {
    private static boolean[][] array;
    private static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        array = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            String data = bf.readLine();
            for (int j = 0; j < N; j++) {
                if (data.charAt(j) == 'W') {
                    array[i][j] = true;
                }
                else {
                    array[i][j] = false;
                }
            }
        }

        int M_row = M - 7;
        int N_row = N - 7;

        for (int i = 0; i < M_row; i++) {
            for (int j = 0; j < N_row; j++) {
                count(i, j);
            }
        }
        System.out.println(min);
    }

    public static void count(int x, int y) {
        int x_max = x + 8;
        int y_max = y + 8;
        int count = 0;

        boolean TF = array[x][y];

        for (int i = x; i < x_max; i++) {
            for (int j = y; j < y_max; j++) {
                if (array[i][j] == TF) {
                    count++;
                }
                TF = !TF;
            }
            TF = !TF;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(count, min);
    }
}

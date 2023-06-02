package daily.solvedAc.class2.step1.수학.기하학;
// 직각삼각형
// 직각삼각형인지 아닌지를 판별하라
// 맞다면 right
// 틀리다면 wrong
// 가장 마지막 입력에는 0 0 0 이 입력된다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            if (x == 0 && y == 0 && z == 0) {
                break;
            }
            if (Math.pow(z, 2) == Math.pow(x, 2) + Math.pow(y, 2)) {
                System.out.println("right");
            }
            else if (Math.pow(x, 2) == Math.pow(y, 2) + Math.pow(z, 2)) {
                System.out.println("right");
            }
            else if (Math.pow(y, 2) == Math.pow(x, 2) + Math.pow(z, 2)) {
                System.out.println("right");
            }
            else System.out.println("wrong");
        }
    }
}
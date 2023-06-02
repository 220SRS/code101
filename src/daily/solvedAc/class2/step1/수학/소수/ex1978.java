package daily.solvedAc.class2.step1.수학.소수;
//소수 찾기
// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하라

// 2, 3, 5, 7의 배수를 제외하고 다 소수(본인도 소수)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            boolean decimal = true;
            if(num == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    decimal = false;
                    break;
                }
            }
            if(decimal) {
                count++;
            }
        }
        System.out.println(count);
    }
}

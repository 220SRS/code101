package daily.solvedAc.class2.step1.구현.조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이항계수 1
// 자연수 N과 정수 K가 주어졌을 때 이항 계수를 구하라
public class ex11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        for (int i = 1; i <= k; i++) {
            b *= i;
        }
        for (int i = 1; i <= n - k; i++) {
            c *= i;
        }
        int result = a / (b * c);
        System.out.println(result);
    }
}

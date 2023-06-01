package daily.solvedAc.class1.step2;
// 상수
// 상근이 동생 상수 이야기
// 두 수 A와 B가 주어진다.
// 이 두 숫자를 거꾸로 했을때 더 큰 숫자를 출력하라
// 두수는 같지 않는 세자리수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken();
        String comparison = st.nextToken();
        String reverseNum = "";
        String reverseComparison = "";
        for (int i = 2; i >= 0; i--) {
            reverseNum += num.charAt(i);
            reverseComparison += comparison.charAt(i);
        }
        int A = Integer.parseInt(reverseNum);
        int B = Integer.parseInt(reverseComparison);
        if(A > B) {
            System.out.println(A);
        }
        else {
            System.out.println(B);
        }
    }
}

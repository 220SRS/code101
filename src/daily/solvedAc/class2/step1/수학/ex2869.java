package daily.solvedAc.class2.step1.수학;
// 달팽이는 올라가고 싶다
// 땅 위에는 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라간다
// 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
// 또, 정상에 올라간 후에는 미끄러지지 않는다.
// 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸릴까?

//입력
// 첫째 줄에 세 정수 A, B, V가 공백으로 주어진다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int days = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            days++;
        }
        System.out.println(days);
    }
}

package daily.solvedAc.class2.step1.브루트포스;
// 덩치
// 우리는 사람의 덩치를 키와 몸무게, 이 두개의 값으로 표현하여 그 등수를 매겨보려고 한다
// 어떤 사람의 몸무게가 x Kg이고 키가 y cm라면 이 사람의 덩치는 (x, y)로 표시도니다.
// 두 사람 A 와 B의 덩치가 각각 (x,y), (p, q)라고 할때 x > p 그리고 y > q 라면
// 우리는  A의 덩치가 B보다 큰 셈이 된다. 그런데 서로 다른 덩치끼리 크기를 정할 수 없는 경우도 있다.
// 예를 들어 두 사람 C와 D의 덩치가 각각 (45, 181) , (55, 173)이라면 몸무게는 D가 C보다 더 무겁고,
// 키는 C가 더 크므로 누가 더 크다고 할 수 없다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int[][] array = new int[T][2];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int rank = 1;
            int weight = array[i][0];
            int height = array[i][1];
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                if (weight < array[j][0] && height < array[j][1]) {
                    rank++;
                }
            }
            sb.append(rank + " ");
        }
        System.out.println(sb);
    }
}

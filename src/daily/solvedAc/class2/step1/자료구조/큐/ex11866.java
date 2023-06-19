package daily.solvedAc.class2.step1.자료구조.큐;
// 요세푸스 문제 0
// 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(<= N)가 주어진다.
// 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라
// 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
// 원에서 사람들이 제거되는 순서를 (N, K) 요세푸스 순열이라고 한다.
//


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ex11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int sequence = Integer.parseInt(st.nextToken());
        List<Integer> result = new ArrayList<>();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            array.add(i + 1);
        }
        int count = 1;
        while (true) {
            for (int i = 0; i < array.size(); i++) {
                if (count == sequence && array.get(i) != 0) {
                    result.add(array.get(i));
                    array.set(i, 0);
                    count = 1;
                }
                else if (array.get(i) != 0) {
                    count++;
                }
            }
            if (result.size() == num) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < result.size(); i++) {
            if (result.size() - 1 == i) {
                sb.append(result.get(i) + ">");
            }
            else {
                sb.append(result.get(i) + ", ");
            }
        }
        System.out.println(sb);
    }
}

package daily.solvedAc.class2.step1.정렬;

// 수 정렬하기 2
// 오른차순으로 정렬하라
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ex2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(list);
        for (int data : list) {
            sb.append(data).append('\n');
        }
        System.out.println(sb);
    }
}
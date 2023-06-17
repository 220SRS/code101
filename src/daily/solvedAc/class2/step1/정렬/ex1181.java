package daily.solvedAc.class2.step1.정렬;
// 단어 정렬
// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하라
// 1 길이가 짧은 것 부터
// 2 길이가 같으면 사전 순으로
// 단 중복된 단어는 하나만 남기고 제거해야 한다.

//이중배열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ex1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];
        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');

        for (int i = 1; i < T; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}

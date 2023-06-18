package daily.solvedAc.class2.step1.정렬;
// 나이순 정렬
// 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
// 회원들의 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는
// 순서로 정렬하는 프로그램을 작성하라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        String[] array = new String[1000];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int age = Integer.parseInt(st.nextToken());
            if (array[age] != null) {
                array[age] = array[age] + '\n' + age + " " + st.nextToken();
            }
            else {
                array[age] = st.nextToken();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(i + " " + array[i]);
            }
        }
    }
}

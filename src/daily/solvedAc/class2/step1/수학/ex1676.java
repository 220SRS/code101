package daily.solvedAc.class2.step1.수학;
// 팩토리얼 0의 개수
// 무작위 숫자 N이 주어지고 N!를 했을 때 뒤에서 부터 0을 세는데 0이 아닌 숫자가 나올때까지 나온
// 0의 개수를 센다
// 10! -> 3,628,800 -> 2개

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count = 0;
        while (N >= 5) {
            count += N / 5;
            N /= 5;
        }
        System.out.println(count);
    }
}

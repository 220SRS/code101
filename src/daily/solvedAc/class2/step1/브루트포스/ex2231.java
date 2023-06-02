package daily.solvedAc.class2.step1.브루트포스;


// 분해합
// 어떤 자연수 N
// 그 자연수 N의 분해 합은 N과 N을 이루는 각 자리수의 합
// 어떤 자연수 M의 분해합이 N인 경우
// M을 N의 생성자라 함
// 245의 분해합은 256(=245+2+4+5)가 된다.
// 따라서 245는 256의 생성자가 된다.
// N의 가장 작은 생성자를 구하라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ex2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String N = bf.readLine();
        int NLen = N.length();

        int NInt = Integer.parseInt(N);
        int result = 0;

        for (int i = (NInt - (NLen * 9)); i < NInt; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == NInt) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
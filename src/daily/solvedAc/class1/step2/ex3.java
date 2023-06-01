package daily.solvedAc.class1.step2;
// 검증수
// 6자리 고유번호
// 처음 5자리는 00000 ~ 99999 중 하나 주어짐
// 마지막 6번째에 검증수 들어감
// 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지가 검증수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = input.split(" ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            sum += Math.pow(num, 2);
        }
        System.out.printf("%d", sum % 10);
    }
}

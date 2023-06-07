package daily.thisIsACodingTest.greedy;

// 1이 될 때까지
// 어떠한 수 N이 1이 될 때 두 과정 중 하나를 선택하여 수행한다.
// 단, 두번째 연산은 N이 K로 나누어떨어질 때만 선택할 수 있다.

// N에서 1을 뺀다
// N을 K로 나눈다

// 그런 위의 두 방법을 최소 몇번을 사용해야 1이 되는지 구하라

// k로 나누어 떨어지는 확인
// 나누어 떨어진다면 몫이 1인지 확인
// 안 나누어 떨어진다면 1을 빼고 다시 나누어 떨어지는지 확인
// 몫이 1이 아니라면 다시 위과정 반복
// 한번 연산시마다 count

import java.util.Scanner;

public class greedy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int rem = 0;
        while(num != 1) {
            rem = num % k;
            if (rem != 0) {
                num = num - 1;
            }
            else {
                num = num / k;
            }
            count++;
        }
        System.out.println(count);
    }
}

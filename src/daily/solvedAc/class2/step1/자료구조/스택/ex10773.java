package daily.solvedAc.class2.step1.자료구조.스택;
// 제로
// 잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다
// 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고 싶어 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(bf.readLine());
            if (num == 0) {
                stack.pop();
            }
            else {
                stack.push(num);
            }
        }
        int result = 0;
        for (int num : stack) {
            result += num;
        }
        System.out.println(result);
    }
}

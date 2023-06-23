package daily.solvedAc.class2.step1.자료구조.스택;
// 스택
// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오
// 명령은 총 다섯 가지이다.
// push X : 정수 X를 스택에 넣는 연산이다.
// pop : 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 없을시 -1
// size : 스택에 들어있는 정수의 개수를 출력
// empty : 없으면 1, 있으면 0
// top : 스택에 가장 위에 있는 정수 출력, 없을 시 -1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ex10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            switch (st.nextToken()) {
                case "push":
                    stack.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (stack.size() == 0) {
                        System.out.println(-1);
                    }
                    else {
                        int num = stack.get(stack.size() - 1);
                        stack.remove(stack.size() - 1);
                        System.out.println(num);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.size() == 0) {
                        System.out.println(1);
                    }
                    else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if (stack.size() == 0) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(stack.get(stack.size() - 1));
                    }
                    break;
            }
        }
    }
}

package daily.solvedAc.class2.step1.자료구조.큐;
// 카드 2
// N장의 카드가 있다. 각각의 카드는 차례로 1부터 N까지의 번호가 붙어 있으며,
// 1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여있다.
// 이제 다음과 같은 동작을 카드가 한 장 남을 때까지 반복한다.
// 우선 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는
// 카드 밑으로 옮긴다.
// 그럼 제일 마지막에 남는 카드가 무엇인지 구하라


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ex2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < N + 1; i++) {
            queue.add(i);
        }
        for (int i = 0; 1 != queue.size(); i++) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
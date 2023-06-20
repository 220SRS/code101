package daily.solvedAc.class2.step1.자료구조.큐;
// 큐
// 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성
// 명령은 총 여섯가지
// push x : 정수 x를 큐에 넣는 연산
// pop : 큐에서 가장 앞에 있는 정수르 빼고 출력, 없으면 -1
// size : 큐에 들어있는 정수의 개수 출력
// empty : 큐가 비어있으면 1, 아니면 0
// front : 큐의 가장 앞에 있는 정수 출력, 없으면 -1
// back : 큐의 가장 뒤에 있는 정수 출력, 없으면 -1

// 입력
// 첫째 줄에 명령의 수 N, 둘째 줄부터 명령


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ex10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        List<Integer> queue = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (queue.size() == 0) {
                        System.out.println(-1);
                    }
                    else {
                        int num = queue.get(0);
                        queue.remove(0);
                        System.out.println(num);
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if (queue.size() != 0) {
                        System.out.println(0);
                    }
                    else {
                        System.out.println(1);
                    }
                    break;
                case "front":
                    if (queue.size() == 0) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(queue.get(0));
                    }
                    break;
                case "back":
                    if (queue.size() == 0) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(queue.get(queue.size() - 1));
                    }
                    break;
            }
        }
    }
}

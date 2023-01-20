package daily.ex07;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;


public class GreedyEx {
    public static void main(String[] args) {
        int output = greedy(new int[]{60, 80, 120, 90, 130}, 140);
        System.out.println(output); // 3

    }
    private static int greedy(int[] stuff, int limit) {
        //김코딩과 박해커의 이사 짐들이 이사용 박스에 많이 들어가지 않는다.
        //박스에는 2개의 짐만 넣을 수 있다.
        //박스에 중량 제한이 있다.
        //짐들 무게 = {70, 50, 80, 50}, 리미트 = 100
        //최대 3번, (70, 80, 50+50)

        //선택 절차(Selection Procedure): 현재 상태에서의 최적의 해답을 선택합니다
        //적절성 검사(Feasibility Check): 선택된 해가 문제의 조건을 만족하는지 검사합니다.
        //해답 검사(Solution Check): 원래의 문제가 해결되었는지 검사하고, 해결되지 않았다면 선택 절차로 돌아가 위의 과정을 반복합니다.

        //선택 절차 : 박스 사용을 최소한으로 하기 위해서 리미트에 가깝게 조합을 하여 선택한다.
        //적절성 검사 : 짐 2개의 합 또는 1개가 리미트와 같거나 거의 차이가 없는지 검사한다. 만약 초과한다면 다른 조합을 찾거나 한개로 보낸다.
        //해답 검사 : 박스를 사용한 결과값 들을 비교하여 최소 값인지 확인한다.

        //의사 코드
        //stuff안에 값들을 확인한다.
        //리미트와 같거나 얼마차이 안나는 조합을 찾는다.
        //카운트를 한다.


        //수도 코드
        //Queue<Integer> qbox = new LikedList<>( stuff를 링크드리스트 타입으로 만든다. )

        LinkedList<Integer> list = new LinkedList<>(Arrays.stream(stuff).boxed().collect(Collectors.toList()));

        int head = 0;
        int tail = 0;
        int count = 0;
        int max = 0;
        int sum = 0;

        while (list.size() >= 0) {
            if(list.size() == 1) count += 1;
        //  qbox에서 요소를 가져온다.
            max = 0;
            head = list.poll();
            max = head;
        //  1번 나머지 요소들과 합을 구하여 리미트보다 같거나 작은 것중 가장 큰값을 구한다.
        //  2번(차후) 가장 큰 값과 작은 값을 합쳐서 리미트와 가깝게 무게를 맞추는 것
            for(int j = 0; j < list.size(); j++) {
                tail = list.get(j);
                sum = head + tail;
                if (limit >= sum) {
                    max = Math.max(max, sum);
                }
            }
            if(head != max && list.size() != 0) {
                list.remove(list.indexOf(max - head));
            }
            else if(list.size() == 0) break;
            count++;
        }
        //  찾았다면 각 요소들을 qbox에서 제거한다.
        //  카운트를 +1 을 해준다
        //  위 반복
        // }
         return count;
    }
}
package daily.programmers.stackOrQueue;

// 기능 개발
// 리스트로 여러개의 작업들의 달성률이 나와있고 각 작업의 작업 속도가 주어진다
// 순서가 뒤인 작업이 달성 되더라도 앞에 작업이 달성 되어야 함께 배포된다
// 그럼 함께 배포될때 마다 몇 개의 기능이 배포되었는지 return하라

//제한사항
// 작업의 개수는 100개 이하
// 작업 진도는 100 미만
// 작업 속도는 100 이하
// 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정
// 예시로 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어진다


//문제풀이
// 각 작업이 100% 달성될라면 며칠이 걸리는지 계산하고 리스트에 저장한다
// 저장된 리스트 안에 첫번째 작업일수를 기준으로 다음 작업일수가 그보다 작으면 카운트를 한다
// 그렇게 끝까지 되었다면 리턴한다
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] progresses1 = {95, 90, 99, 99, 80, 99};
        int[] speeds1 = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(progresses1, speeds1)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> jobFinishDays = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int quotient = (100 - progresses[i]) / speeds[i];
            int remainder = (100 - progresses[i]) % speeds[i];
            if(remainder == 0) {
                jobFinishDays.add(quotient);
            }
            else {
                jobFinishDays.add(quotient+1);
            }
        }
        List<Integer> outPutQuantities = new ArrayList<>();
        while (jobFinishDays.size() != 0) {
            int count = 1;
            int standard = 0;
            standard = jobFinishDays.poll();
            if (jobFinishDays.size() != 0) {
                while (standard >= jobFinishDays.peek()) {
                    jobFinishDays.poll();
                    count++;
                    if(jobFinishDays.size() == 0) {
                        break;
                    }
                }
            }
            outPutQuantities.add(count);
        }
        int[] answer = new int[outPutQuantities.size()];
        for (int i = 0; i < outPutQuantities.size(); i++) {
            answer[i] = outPutQuantities.get(i);
        }
        return answer;
    }
}
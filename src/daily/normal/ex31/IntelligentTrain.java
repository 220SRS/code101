package daily.normal.ex31;

import java.util.*;

public class IntelligentTrain {
    // 백준 2460번 지능형 기차 2

    //최근에 개발된 지능형 기차가 1번역(출발역)부터 10번역(종착역)까지 10개의 정차역이
    //있는 노선에서 운행되고 있다.

    //이 기차에는 타거나 내리는 사람 수를 자동으로 인식할 수 있는 장치

    //이 장치를 이용하여 출발역에서 종착역까지 가는 도중 기차 안에 사람이 가장 많을 때의
    // 사람 수를 계산하려고 한다.

    // 단, 이 기차를 이용하는 사람들은 질서 의식이 투철하여, 역에서 기차에 탈 때,
    // 내릴 사람이 모두 내린 후에 기차에 탄다고 가정한다.

    //1번역은 내린사람이 0
    //10번역은 탄사람이 0

    //현재 기차에 있는 사람
    //다음역에서의 기차에 있는 사람

    // 각 역에서의 기차안에 있는 사람 수를 계산하여 리스트에 저장한 후 나중에 Max로 뽑아낸다.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> dataLog = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            Integer data = scanner.nextInt();

            dataLog.add(data);
        }
        Integer max = calculator(dataLog);

        System.out.println(max);
    }

    public static Integer calculator(Queue<Integer> dataLog) {
//        List<Integer> totalList = new ArrayList<>();
//
//        Integer total = 0;
//        int count = 0;
//
//        while (dataLog.size() != 0) {
//            if(count == 2) {
//                count = 0;
//                totalList.add(total);
//                total = 0;
//            }
//            else if(count == 0){
//                total -= dataLog.poll();
//            }
//            else {
//                total += dataLog.poll();
//            }
//            count++;
//        }
//
//        return totalList.stream()
//                .mapToInt(x -> x)
//                .max()
//                .orElseThrow(NoSuchFieldError::new);
        List<Integer> totalList = new ArrayList<>();

        Integer total = 0;

        while (dataLog.size() != 0) {
            total -= dataLog.poll();
            total += dataLog.poll();
            totalList.add(total);
        }

        return totalList.stream()
                .mapToInt(x -> x)
                .max()
                .orElseThrow(NoSuchFieldError::new);
    }
}

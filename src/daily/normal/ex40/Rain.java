package daily.normal.ex40;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rain {
    // 14719번 빗물

    //문제
    // 2차원 세계에 블록이 쌓여있다. 비가 오면 블록 사이에 빗물이 고인다.
    //비는 충분히 많이 온다. 고이는 빗물의 총량은 얼마일까?

    //입력
    //첫 번째 줄에는 2차원 세계의 세로 길이 H와 2차원 세계의 가로 길이 W가 주어진다.
    //두 번째 줄에는 블록이 쌓인 높이를 의미하는 0이상 H이하의 정수가 2차원 세계의
    //맨 왼쪽 위치부터 차례대로 W개 주어진다.
    //따라서 블록 내부의 빈 공간이 생길 수 없다. 또 2차원 세계의 바닥은 항상 막혀있다고
    //가정하여도 좋다.
    //4 4
    //3 0 1 4

    //출력
    //2차원 세계에서는 한 칸의 용량은 1이다. 고이는 빗물의 총량을 출력하여라.
    //빗물이 전혀 고이지 않을 경우 0을 출력하라
    //5

    public static int result = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> dataList = new ArrayList<>();

        String place = scanner.nextLine();
        String block = scanner.nextLine();

        dataList.add(place);
        dataList.add(block);

        System.out.println(rainCalculator(dataList));

    }

    private static int rainCalculator(List<String> dataList) {
        List<Integer> place = Stream.of(dataList.get(0).split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> block = Stream.of(dataList.get(1).split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int width = place.get(1);
        int maxHeight = 0;
        int minHeight = 0;

        for (int i : block) {

        }

        return result;
    }
}

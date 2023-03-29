package daily.ex35;

import java.util.*;
import java.util.stream.Collectors;

public class NthLargestNum {
    // 2693번 N번째 큰 수

    //문제
    // 배열 A가 주어졌을 때, N번째 큰값을 출력하는 프로그램을 작성하시오
    // 배열 A의 크기는 항상 10이고, 자연수만 가지고 있다.
    // N은 항상 3이다.

    //입력
    // 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로
    // 이루어져 있고, 배열 A의 원소 10개가 공백으로 구분되어 주어진다.
    // 이 원소는 1본다 크거나 같고, 1000보다 작거나 같은 자연수이다.

    //4
    //1 2 3 4 5 6 7 8 9 1000
    //338 304 619 95 343 496 489 116 98 127
    //931 240 986 894 826 640 965 833 136 138
    //940 955 364 188 133 254 501 122 768 408

    //출력
    // 각 테스트 케이스에 대해 한 줄에 하나씩 배역 A에서 3번째 큰 값을 출력한다.

    //8
    //489
    //931
    //768
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        List<String> dataList = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            String data = scanner.nextLine();
            dataList.add(data);
        }

        List<Integer> result = new ArrayList<>();

        result.addAll(findNum(dataList));

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    private static List<Integer> findNum(List<String> dataList) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < dataList.size(); i++) {
            List<String> data = List.of(dataList.get(i).split(" "));
            List<Integer> numList = new ArrayList<>();

            for (int j = 0; j < data.size(); j++) {
                numList.add(Integer.parseInt(data.get(j)));
            }

            numList.sort(Collections.reverseOrder());

            result.add(numList.get(2));
        }

        return result;
    }
}

package daily.ex33;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SevenDwarfs {
    //2309번 일곱 난쟁이

    // 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다.
    // 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉명이다.

    // 다행히 일곱난쟁이의 키의 합이 100이다.

    // 아홉난쟁이의 키가 주어졌을때, 일곱난쟁이를 찾아라

    //입력
    //아홉 난쟁이의 키가 주어진다.
    //20
    //7
    //23
    //19
    //10
    //15
    //25
    //8
    //13

    //출력
    // 일곱난쟁이의 키를 출력하라, 가능한 답이 여러가지인 경우 아무거나 출력
    // 키는 오름차순으로 출력하라
    //7
    //8
    //10
    //13
    //19
    //20
    //23
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> dataList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int data = scanner.nextInt();
            dataList.add(data);
        }

        List<Integer> resultList = findDwarfs(dataList);

        for (Integer integer : resultList) {
            System.out.println(integer);
        }
    }

    private static List<Integer> findDwarfs(List<Integer> dataList) {
        // 앞에서 2명을 빼고 나머지 7명을 더한다.
        // 합이 100과 같으면 그대로 리턴

        // 아니면 첫번째를 고정시키고 두번째를 한칸 밀어서 다시 더한다.
        // 반복

        List<Integer> resultList = new ArrayList<>();

        for(int i = 0; i < dataList.size() - 1; i++) {
            for(int j = i + 1; j < dataList.size(); j++) {
                int sum = dataList.stream()
                        .mapToInt(x -> x)
                        .sum();
                sum -= dataList.get(i) + dataList.get(j);

                if(sum == 100) {
                    dataList.remove(i);
                    dataList.remove(j - 1);
                    resultList.addAll(dataList);
                    break;
                }
            }
        }
        resultList.sort(Comparator.naturalOrder());
        return resultList;
    }
}

package daily.thisIsACodingTest.greedy;

import java.util.ArrayList;
import java.util.List;

public class greedy1 {
    // 숫자 카드 게임
    // 여러개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한 장을 뽑는 게임이다.

    // 1. 숫자가 쓰인 카드들이 N x M 형태로 놓여 있다. 이때 N은 행을, M은 열을
    // 2. 먼저 뽀고자 하는 카드가 포함되어 있는 행을 선택한다.
    // 3. 선택된 행해서 가장 낮은 숫자를 뽑아야한다.
    // 4. 처음에 행을 고를 때, 가장 마지막을 행에서 뽑을 숫자 카드를 고려하여 전략적으로 뽑으라

    // 카드를 뽑는 프로그램을 만들어라

    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        int[] inputData = {1, 2, 3, 4, 5, 6, 6, 4, 3};
        List<Integer> dataList = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < inputData.length; i++) {
            min = Math.min(min, inputData[i]);
            count++;
            if(count == row) {
                System.out.println(min);
                min = Integer.MAX_VALUE;
                count = 0;
            }
        }
    }
}

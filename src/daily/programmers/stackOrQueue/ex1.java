package daily.programmers.stackOrQueue;
//같은 숫자는 싫어!
// 배열 arr가 주어진다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있다. 이때, 배열 arr에서 연속적으로 나타나는
// 숫자는 하나만 남기고 전부 제거 하려고 한다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야한다

// 예시
// [1,1,3,3,0,1] -> [1,3,0,1]

//제한사항
// 배열 arr의 크기 : 1,000,000 이하의 자연수
// 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

//문제풀이
// 매개변수가 null인지 확인한다
// arr 배열에서 첫번 째 숫자를 answer 배열에 담겨있는 마지막 숫자와 비교한다
// 비교하여 숫자가 같으면 숫자를 삭제하고 다르다면 그대로 삽입한다.
// 반복


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] result = solution(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] arr) {
        List<Integer> resultList = new ArrayList<>(){};
        resultList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(resultList.get(resultList.size() - 1) != arr[i]) {
                resultList.add(arr[i]);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}

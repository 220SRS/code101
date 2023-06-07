package daily.normal.ex10;

import java.util.ArrayList;
import java.util.Arrays;

public class RSP {
    static String[] headers = new String[] {"rock", "paper", "scissors"};
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rockPaperScissors(5).toArray()));
    }
    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        //가위바위보 게임
        //2인 이상의 사람이 동시에 '가위, 바위, 보'를 외치고 셋중에 하나를 냄
        //3판의 가위바위보를 할경우 한사람이 rounds만큼 선택할 수 있음
        //조합의 관한 문제

        //rock, paper, scissors 순으로 배열에 담아 for문 이용하여 돌아가도록 만든다.
        //재귀로 순서를 담아오면서 가지고 나옴
        //재귀 로직
        //재귀를 가장 끝 인덱스에 도달하게 만듬
        //가장 끝에서 for문이 돌아가고 다돌아가면 전단계로 돌아감
        //전단계에서 for문이 돌아가고 다시 재귀로 들어가고
        //이걸 반복하여 최종 for문까지 돌림


        //1. 선언 자체를 class 변수로 선언

        //2. 재귀 메소드 생성

        //3. 조건에 따라 예외 처리
            //조건을 만족 시킬 수단이 필요

        ArrayList<String[]> result = new ArrayList<>();
        String[] list = new String[rounds];


        return rec(result, list, rounds, 0);
    }

    public static ArrayList<String[]> rec(ArrayList<String[]> result, String[] list, int rounds, int cnt) {
        if(cnt == rounds) {
            result.add(list);
            return result;
        }


        for (int i = 0; i < headers.length; i++) {
                list[cnt] = headers[i];
            result = rec(result, list, rounds, cnt+1);
        }

        return result;
    }
}

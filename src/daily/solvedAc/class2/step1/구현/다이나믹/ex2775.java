package daily.solvedAc.class2.step1.구현.다이나믹;
// 부녀회장이 될테야
// 아파트에 거주하려는 조건
// a층의 b호에 살려면 자신의 아래 (a-1)층의 1호부터 b호까지 사람들의 수의 합만큼
// 사람들을 데려와 살아야 한다.
// 아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키기고 있을때
// 주어지는 K와 N에 대해 K층에 N호에 몇 명이 살고 있는지 출력하라
// 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으면, 0층의 i호에는 i명이 산다.

// 입력
// 첫째줄에 T 부터 시작
// 그다음 부터 차례대로 첫번째 줄에는 K가 두번째 줄에는 N이 주어진다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            int floor = Integer.parseInt(bf.readLine());
            int room = Integer.parseInt(bf.readLine());
            if (room == 1) {
                System.out.println(1);
            }
            else if (room == 2) {
                System.out.println(floor + 2);
            }
            else {
                int[] floorPeople = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
                for (int j = 0; j < floor; j++) {
                    floorPeople[1] = floorPeople[1] + 1;
                    for (int k = 2; k < room; k++) {
                        floorPeople[k] = floorPeople[k - 1] + floorPeople[k];
                    }
                }
                System.out.println(floorPeople[room - 1]);
            }
        }
    }
}

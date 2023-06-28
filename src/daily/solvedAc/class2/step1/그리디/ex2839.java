package daily.solvedAc.class2.step1.그리디;
// 설탕 배달
// 상근이는 사탕가게에 설탕을 정확하게 N킬로그램 배달해야 한다
// 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다
// 봉지는 3킬로그램 봉자와 5킬로그램 봉지가 있다
// 최대한 적은 봉지를 들고 가려 한다
// 정확하게 킬로그램을 만들 수 없다면 -1을 출력한다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ex2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(bf.readLine());

        if (sugar == 4 || sugar == 7) {
            System.out.println(-1);
        }
        else if (sugar % 5 == 0) {
            System.out.println(sugar / 5);
        }
        else if (sugar % 5 == 1 || sugar % 5 == 3) {
            System.out.println(sugar / 5 + 1);
        }
        else if (sugar % 5 == 2 || sugar % 5 == 4) {
            System.out.println(sugar / 5 + 2);
        }
    }
}

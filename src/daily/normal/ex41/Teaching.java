package daily.normal.ex41;

import java.util.Scanner;

public class Teaching {
    // 1062번 가르침

    //학생들은 K개의 글자로만 이루어진 단어만을 읽을 수 있다.
    //남극언어의 모든 단어는 anta로 시작되고, tica로 끝난다.
    //남극언어에 단어는 N개 밖에 없다고 가정한다.
    //학생들이 읽을 수 있는 단어의 최댓값을 구하시오

    //입력
    //첫째 줄에 단어의 개수 N과 K
    // N <= 50 , K <= 26 || 0 ,
    static int N, K, maxCount;
    static int[] words;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        maxCount = 0;
        words = new int[N];

        for (int i = 0; i < N; i++) {
            String word = sc.next().replaceAll("anta|tica", "");
            int bit = 0;
            for (int j = 0; j < word.length(); j++) {
                bit |= 1 << (word.charAt(j) - 'a');
            }
            words[i] = bit;
        }

        if (K >= 5) {
            int base = 0b11111; // 'a', 'n', 't', 'i', 'c'를 포함하는 비트마스크
            dfs(base, 5, 0);
        }

        System.out.println(maxCount);
        sc.close();
    }

    private static void dfs(int learned, int count, int index) {
        if (count == K) {
            int tempCount = 0;
            for (int word : words) {
                if ((word & learned) == word) {
                    tempCount++;
                }
            }
            maxCount = Math.max(maxCount, tempCount);
            return;
        }

        for (int i = index; i < 26; i++) {
            if ((learned & (1 << i)) == 0) {
                dfs(learned | (1 << i), count + 1, i + 1);
            }
        }
    }
}

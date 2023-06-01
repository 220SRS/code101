package daily.solvedAc.class1.step2;
//알파벳 대소문자로 된 단어가 주어짐, 가장 많이 사용한 알파벳을 대문자로 표현
// 단 대소문자 구분 X
// 갯수가 중복된다면 ? 로 표시

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toUpperCase();
        int[] alphabet = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int numberOfAlphabet = word.charAt(i) - 65;
            alphabet[numberOfAlphabet]++;
        }
        int Max = Integer.MIN_VALUE;

        char result = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if(Max == alphabet[i]) {
                result = '?';
            }
            else if (Max < alphabet[i]) {
                Max = alphabet[i];
                result = (char) (i + 65);
            }
        }
        System.out.println(result);
    }
}

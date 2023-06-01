package daily.solvedAc.class1.step1;
// 문자열 S를 입력 받고, 각 문자열을 R번 반복하여 새 문자열을 출력하라
// 입력값
// 3 abc
//출력값
// aaabbbccc

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int repeat = sc.nextInt();
            String inputData = sc.next();
            String[] array = inputData.split("");
            StringBuilder result = new StringBuilder();
            for (String a : array) {
                int count = 0;
                while (count != repeat) {
                    result.append(a);
                    count++;
                }
            }
            System.out.println(result);
        }
    }
}

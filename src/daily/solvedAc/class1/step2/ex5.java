package daily.solvedAc.class1.step2;
// 알파벳 찾기
// 단어가 주어지면 각 알파벳에 맞춰 있으면 처음 등장하는 위치를 없으면 -1을 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine().toUpperCase();
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }
        for (int i = 0; i < data.length(); i++) {
            int index = data.charAt(i) - 65;
            if(alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }
        for (int i = 0; i < alphabet.length - 1; i++) {
            System.out.printf("%d ", alphabet[i]);
        }
        System.out.print(alphabet[alphabet.length - 1]);
    }
}

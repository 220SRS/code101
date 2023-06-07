package daily.solvedAc.class2.step1.구현.문자열;
// 팰린드롬수
// 어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다.
// ex) 'radar', 'sees'
// 수도 팰린드롬으로 취급할 수 있다. 121, 12321 등등
// 입력 받은 수가 팰린드롬이면 yes, 아니면 no를 출력하자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String palindrome = bf.readLine();
            String checkPalindrome = "yes";
            if (palindrome.equals("0")) {
                break;
            }
            int middle = palindrome.length() / 2;
            for (int i = 0; i < middle; i++) {
                if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
                    checkPalindrome = "no";
                }
            }
            System.out.println(checkPalindrome);
        }
    }
}

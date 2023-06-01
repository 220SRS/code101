package daily.solvedAc.class1.step2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sentence, " ");
        System.out.println(st.countTokens());
    }
}
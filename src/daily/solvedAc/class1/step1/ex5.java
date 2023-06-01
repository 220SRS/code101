package daily.solvedAc.class1.step1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfDigits = sc.nextInt();
        int sum = 0;
        String digit = sc.next();
        String[] digits = digit.split("");
        for (int i = 0; i < numberOfDigits; i++) {
            sum += Integer.parseInt(digits[i]);
        }
        System.out.println(sum);
    }
}

package daily.normal.ex02;

import java.util.Scanner;

public class Two {
    //while문을 사용하여 해당 거듭제곱인지 boolean으로 나타내라

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하시요 : ");
        long num1 = Long.parseLong(scanner.nextLine());

        System.out.println("거듭제곱 수를 입력 하시오 : ");
        long num2 = Long.parseLong(scanner.nextLine());

        System.out.printf("%b",powerOfTwo(num1, num2));
    }

    public static boolean powerOfTwo(long num1, long num2) {
        if(num1 == 1) return true;

        long i = num2;

        while(i != num1) {
            i *= num2;
            if(i > num1) return false;
        }
        return true;
    }
}

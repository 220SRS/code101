package daily.normal.ex03;

import java.util.Scanner;

class Character {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문장을 입력하시요 : ");
        String data = scanner.nextLine();
        System.out.println("결과 : " + firstch(data));
    }

    private static String firstch (String data) {

        String result = "";
        String[] spString = data.split(" ");
        for(String str : spString) {
            result += str.substring(0,1);
        }
        return result;
    }
}
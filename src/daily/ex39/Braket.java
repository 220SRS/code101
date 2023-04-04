package daily.ex39;

import java.util.Scanner;
import java.util.Stack;

public class Braket {
    //2504번 괄호의 값
    //4개의 기호 ( , [ , ] , )를 이용해서 만들어지는 괄호열 중에서
    //올바른 괄호열이란

    // ‘()’ 인 괄호열의 값은 2이다.
    //‘[]’ 인 괄호열의 값은 3이다.
    //‘(X)’ 의 괄호값은 2×값(X) 으로 계산된다.
    //‘[X]’ 의 괄호값은 3×값(X) 으로 계산된다.

    //올바른 괄호열 X와 Y가 결합된 XY의 괄호값은 값(XY)= 값(X)+값(Y) 로 계산된다.
    //예를 들어 ‘(()[[]])([])’ 의 괄호값을 구해보자.
    // ‘()[[]]’ 의 괄호값이 2 + 3×3=11 이므로 ‘(()[[]])’의
    // 괄호값은 2×11=22 이다. 그리고 ‘([])’의 값은 2×3=6 이므로
    // 전체 괄호열의 값은 22 + 6 = 28 이다.

    //입력
    //첫째 줄에 괄호열을 나타내는 문자열이 주어진다. 단 그길이는 1이상 30이하이다

    //출력
    //첫째 줄에 그 괄호열이 값을 나타내는 정수를 출력한다. 만일 입력이 올바르지 못한
    //괄호열이면 반드시 0을 출력해야 한다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String bracket = scanner.nextLine();

        int result = bracketCalculator(bracket);
        System.out.println(result);
    }

    private static int bracketCalculator(String bracket) {

        Stack<Character> stack = new Stack<>();
        int result = 0;
        int temp = 1;

        for (int i = 0; i < bracket.length(); i++) {
            char current = bracket.charAt(i);

            switch (current) {
                case '(':
                    stack.push(current);
                    temp *= 2;
                    break;
                case '[':
                    stack.push(current);
                    temp *= 3;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return 0;
                    }
                    if (bracket.charAt(i - 1) == '(') {
                        result += temp;
                    }
                    stack.pop();
                    temp /= 2;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return 0;
                    }
                    if (bracket.charAt(i - 1) == '[') {
                        result += temp;
                    }
                    stack.pop();
                    temp /= 3;
                    break;
            }
        }

        if (!stack.isEmpty()) {
            return 0;
        }

        return result;
    }
}

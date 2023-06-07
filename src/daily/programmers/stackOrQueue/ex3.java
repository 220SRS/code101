package daily.programmers.stackOrQueue;
// 올바른 괄호
// 괄호가 바르게 짝지어졌다는 것은 ( 문자로 열렸으면 반드시 짝지어서 ) 문자로 닫혀야 한다는 뜻이다
// 문자열이 똑바로 열리고 닫혀있는지 return하라

// 제한사항
// 문자열의 길이는 100,000 이하의 자연수
// 문자열은 (, ) 로만 이루어져있다

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ex3 {
    public static void main(String[] args) {
        String test1 = "()()";
        String test2 = "(())()";
        String test3 = ")()(";
        String test4 = "(()(";
        String test5 = "";

        System.out.println(solution(test1));
        System.out.println(solution(test2));
        System.out.println(solution(test3));
        System.out.println(solution(test4));
        System.out.println(solution(test5));
    }

    public static boolean solution(String s) {
        if (s.equals("")) return false;
        List<String> list = List.of(s.split(""));
        if(list.get(0).equals(")") || list.get(list.size() - 1).equals("(")) {
            return false;
        }
        Queue<String> argsQueue = new LinkedList<>(list);
        return checkTheRule(argsQueue);
    }

    private static boolean checkTheRule(Queue<String> s) {
        int count = 0;
        while (s.size() != 0) {
            if("(".equals(s.poll())) {
                count++;
                if(s.size() == 0) {
                    return false;
                }
            }
            if (")".equals(s.poll())) {
                count--;
            }
        }
        if(count != 0) {
            return false;
        }
        return true;
    }
}

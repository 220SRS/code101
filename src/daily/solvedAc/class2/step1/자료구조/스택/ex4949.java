package daily.solvedAc.class2.step1.자료구조.스택;
// 균형잡힌 세상

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class ex4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        while (true) {
            String sentence = bf.readLine();
            if (Objects.equals(sentence, ".")) {
                break;
            }
            Stack<String> stack = new Stack<>();
            String result = "yes";
            for (int i = 0; i < sentence.length(); i++) {
                if (Objects.equals(result, "no")) {
                    break;
                }
                switch (sentence.charAt(i)) {
                    case '(':
                        stack.push("(");
                        break;
                    case '[':
                        stack.push("[");
                        break;
                    case ')':
                        if (stack.empty() || !Objects.equals(stack.peek(), "(")) {
                            result = "no";
                        }
                        else {
                            stack.pop();
                        }
                        break;
                    case ']':
                        if (stack.empty() || !Objects.equals(stack.peek(), "[")) {
                            result = "no";
                        }
                        else {
                            stack.pop();
                        }
                        break;
                }
            }
            if (!stack.empty()) {
                result = "no";
            }
            st.append(result + '\n');
        }
        System.out.println(st);
    }
}

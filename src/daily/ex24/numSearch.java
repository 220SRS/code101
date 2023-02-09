package daily.ex24;

import java.util.ArrayList;

public class numSearch {
    public static void main(String[] args) {
        int output = numberSearch("YlQO uT9");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
    public static int numberSearch(String str) {
        // 문자열에서 숫자를 모두 찾아서 더한다
        // 해당 값을 숫자와 공백을 제외한 나머지 문자열 길이로 나누고
        // 정수로 반올림 하여라

//        입력 값에 공백을 제거한다.
//        글자를 하나씩 순회한다.
//        순회하며 숫자인 글자를 찾는다
//        찾으면 미리 선언한 리스트에 저장한다.
//        순회가 끝나면 문자열 길이와 리스트의 길이를 뺀다
//        리스트에 저장되어 있는 숫자를 다 더하고 아까 뺀 길이로 나눈다.
//        실수라면 반올림 한다.

        if(str.isEmpty()) return 0;

        String noNum = "";
        String onlyNum = "";
        double result = 0;

        //입력 값에 공백을 제거한다.
        str = str.replaceAll(" ", "");

        //이후 숫자를 제거하고 String noNum 변수에 담는다.
        noNum = str.replaceAll("[0-9]", "");

        //공백만 제거한 스트링에서 이번엔 숫자만 String onlyNum에 담는다.
        onlyNum = str.replaceAll("[^0-9]", "");

        // for문으로 onlyNum을 순회하면서 int result에 더해준다.
        for (int i = 0; i < onlyNum.length(); i++) {
            result += Integer.parseInt(String.valueOf(onlyNum.charAt(i)));
        }

        // return 으로 result를 noNum.length() - onlyNum.length() 로 나누어 준다.
        return Integer.parseInt(String.format("%.0f",result / noNum.length()));

    }
}

package daily.ex06;

class letter {
    static int a;
    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1); // "Hello World"
        String output2 = letterCapitalize("java  is good");
        System.out.println(output2); // "Java  Is Good"
    }
    public static String letterCapitalize(String str) {
        // 문자열을 입력받아
        // 문자열을 구성하는 각 단어의 첫 글자가 대문자인 문자열을
        // 리턴해야 합니다.

        // 예외처리
        // 연속된 공백이 존재할 수 있습니다. -> 공백제거 후 빈 문자열이면?
        // 빈 문자(공백)으로만 이루어진 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
        if (str.trim().equals("")) return "";

        String[] splitStr = str.split(" ");   // 공백 단위로 구분

        for(int i = 0; i < splitStr.length; i++ ) {    // 공백 단위로 단어 구분
            if(splitStr[i].equals("")) continue;;   // 빈 문자열일 때는 다음으로

            StringBuilder sb = new StringBuilder(splitStr[i]);
            String head = String.format("%c", splitStr[i].toUpperCase().charAt(0));   // 첫글자만 뺌
            sb.replace(0, 1, head);   // 첫글자 교체

            splitStr[i] = sb.toString();
        }

        return String.join(" ", splitStr);
    }
}
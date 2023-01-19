package daily.ex06;

class letter {
    public static void main(String[] args) {
        String data = "hello world";

        System.out.println(capitalize(data));
    }
    private static String capitalize(String data) {
        //문자열을 입력받아 각 단어의 첫글자를 대문자로 바꿔 리턴하라
        //hello world
        //Hello World

        String result = "";

        String upper = data.toUpperCase();

        result += upper.charAt(0);

        for(int i = 1; i < data.length(); i++) {
            if(data.charAt(i-1) == 32 && i != 0) {
                result += upper.charAt(i);
                continue;
            }
            result += data.charAt(i);
        }

        return result;
    }
}
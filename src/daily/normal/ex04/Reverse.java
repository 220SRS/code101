package daily.normal.ex04;

class Reverse {
    public static void main(String[] args) {
        String data = "hell world";

        System.out.println(reverseStr(data));
    }

    private static String reverseStr (String data) {
        String result = "";

        for(int i = data.length()-1; i >= 0; i--) {
            result += data.charAt(i);
        }
        return result;
    }
}
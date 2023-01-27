package daily.ex13;

public class AB {
    public static void main(String[] args) {
        boolean output = ABCheck("aaaaaccccbbbbb");
        System.out.println(output); // --> true
    }
    public static boolean ABCheck(String str) {
        int start = 0;
        int end = 0;
        boolean result = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                start = i;
            }
            else if(str.charAt(i)=='b' || str.charAt(i)=='B') {
                end = i;
            }

        }
            if(Math.abs(start-end) == 4) {
                result = true;
            }
        return result;
    }
}

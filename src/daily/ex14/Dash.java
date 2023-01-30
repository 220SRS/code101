package daily.ex14;

public class Dash {
    public static void main(String[] args) {
        String output = insertDash("");
        System.out.println(output);
    }
    public static String insertDash(String str) {
        if(str.isEmpty()) return null;

        String result = "";

        for(int i = 0; i < str.length()-1; i++) {
            result += str.charAt(i);
            if(str.charAt(i)%2==1 && str.charAt(i+1)%2==1 ){
                result += "-";
            }
        }
        return result += str.charAt(str.length()-1);
    }
}

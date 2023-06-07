package daily.normal.ex20;

public class Islsogram {
    public static void main(String[] args) {
        long beforeTime = System.nanoTime(); //코드 실행 전에 시간 받아오기

        boolean output = isIsogram("abcdefghijklmnopqrstuvwxyz");
        System.out.println(output); // false

//        output = isIsogram("Dermatoglyphics");
//        System.out.println(output); // true
//
//        output = isIsogram("moOse");
//        System.out.println(output); // false

        long afterTime = System.nanoTime();
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("시간차이(nano) : "+secDiffTime);
    }

    public static boolean isIsogram(String str) {
        // 문자열의 글자가 중복되지 않게 만들어져 있는지 확인하는 코드

        // charAt을 이용하여 for문으로 문자열을 순회한다.

        // 이중 for문을 사용해 바깥 for문은 비교할 기준 대상 설정

        // 안쪽 for문은 기준을 제외한 나머지를 비교하면서 순회

        // 만약 같은 글자가 있다면 바로 false로 리턴하며 멈춤


//        char stdChar;
//
//        for(int i = 0; i < str.length() - 1; i++) {
//            stdChar = str.charAt(i);
//            for(int j = i + 1; j < str.length(); j++) {
//                if(stdChar == str.charAt(j)) {
//                    return false;
//                }
//            }
//        }
//
//        return true;

//        예외처리 : 대소문자 상황
//        char stdChar;
//
//        for(int i = 0; i < str.length() - 1; i++) {
//            stdChar = str.charAt(i);
//            for(int j = i + 1; j < str.length(); j++) {
//                if(stdChar == str.charAt(j) || stdChar == str.charAt(j)+32 ) {
//                    return false;
//                }
//            }
//        }
//
//        return true;

//        //입력된 문자열이 공백일 경우 true를 리턴합니다.
//        if(str.length() == 0) return true;
//
//        //사용된 알파벳을 저장할 HashMap을 선언합니다.
//        HashMap<Character, String> cache = new HashMap<Character, String>();
//
//        //입력된 전체 문자열을 모두 소문자로 변환합니다.
//        str = str.toLowerCase();
//
//        //입력된 문자열을 순회하며
//        for(int i = 0; i < str.length(); i++) {
//            //HashMap에 이미 해당 알파벳이 저장되어 있다면
//            if(cache.containsKey(str.charAt(i))) {
//                //false를 리턴합니다.
//                return false;
//            }
//            //HashMap에 해당 문자열이 저장되어 있지 않다면, 저장합니다.
//            cache.put(str.charAt(i), "Exists");
//        }
//        //모든 문자열을 순회한다면 true를 리턴합니다.
//        return true;

        boolean result2 = str.chars()
                .map(Character::toUpperCase)
                .distinct()
                .count() == str.length();

        return result2;



    }
}

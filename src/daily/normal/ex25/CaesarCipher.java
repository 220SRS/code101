package daily.normal.ex25;

public class CaesarCipher {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("dssoh", 3);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25);
        System.out.println(output); // --> world
    }

    public static String decryptCaesarCipher(String str, int secret) {
        // 카이사르 암호
        // 입력값을 secret의 개수 만큼 문자열에 각 해당 글자의 알파벳을 오른쪽으로 이동시켜 암호화한다. 이것이 카이사르 암호
        // 우린 이것을 다시 되돌려 놓아서 복화를 진행시킨다.
        // DEF, secret = 3 (D -> A) (E -> B) (F -> C)

        // 주의사항
        // 빈문자열은 그대로 리턴
        // 공백은 건들지 마라
        // 입력값은 모두 소문자

        // 일단 해당 문자열을 각각 한글자로 순회한다.
        // 한글자씩 변수에 secret를 뺀채로 담는다 (Ascii 코드 사용)

        String result = "";

        for(char data : str.toCharArray()) {
            if (data == ' ') {
                result += data;
            }
            else if(data-secret < 97) {
                int check = 96 - (data - secret);
                result += Character.toString((char) (122 - check));

            }
            else result += Character.toString((char) (data - secret));
        }

        return result;
    }

}

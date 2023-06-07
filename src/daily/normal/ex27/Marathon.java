package daily.normal.ex27;

import java.util.HashMap;

public class Marathon {
    public static void main(String[] args) {
        String[] test1 = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] test2 = new String[] {"stanko", "ana", "mislav"};
        System.out.println(solution(test1,test2));
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> check = new HashMap<>();

        for (int i = 0; i < completion.length; i++) {
            check.put(completion[i], 0);
        }

        for (int i = 0; i < participant.length; i++) {
            if(check.containsKey(participant[i])) {
                check.replace(participant[i],check.get(participant[i])+1);
            }
            else return participant[i];
        }

        for (int i = 0; i < participant.length; i++) {
            if(check.get(participant[i]) >= 2) {
                return participant[i];
            }
        }
        return answer;
    }
}

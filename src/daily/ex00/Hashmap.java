package daily.ex00;

import java.util.HashMap;

class Hashmap {
    public static void main(String[] args) {
        String[] test = new String[]{"a", "b", "c", "d"};

        HashMap<String, String> result = new HashMap<>();

        for (int i = 0; i < test.length / 2; i++) {
            result.put(test[i], test[test.length - i - 1]);
        }
        System.out.println(result);
    }
}

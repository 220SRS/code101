package daily.ex08;

import java.util.Collections;
import java.util.HashMap;

class Hash {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"apple", "Red"},
                {"banana", "Yellow"},
                {"melon", "Green"},
                {"grape", "Purple"},
        };
        String[][] arr2 = new String[][]{
                {"happy", "Life"},
                {"first", "second"},
                {"make", "Money"},
                {"first", "cloud"},
                {"cow", "Boy"}

        };
        String[][] arr3 = new String[][]{{}};


        System.out.println(Collections.unmodifiableMap(HashMap(arr2)));


    }

    private static HashMap<String, String> HashMap(String[][] data) {
        HashMap<String, String> hashData = new HashMap<>();

        for (String[] list : data) {
            if(list.length == 0) return hashData;
            else if (hashData.containsKey(list[0])) continue;
            hashData.put(list[0], list[1]);
        }
        return hashData;
    }
}

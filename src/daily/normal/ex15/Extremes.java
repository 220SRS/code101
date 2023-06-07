package daily.normal.ex15;

import java.util.ArrayList;
import java.util.Arrays;

class Extremes {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(Arrays.toString(output)); // --> ["a"', "b"]
    }
    public static String[] removeExtremes(String[] arr) {

        if(arr.length == 0) return null;

        String min = arr[0];
        String max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(min.length() >= arr[i].length()) {
                min = arr[i];
            }
            if(max.length() <= arr[i].length()) {
                max = arr[i];
            }
        }
        ArrayList<String> listArr = new ArrayList<>(Arrays.asList(arr));

        listArr.remove(min);
        listArr.remove(max);

        return listArr.toArray(new String[listArr.size()]);
    }
}

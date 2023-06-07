package daily.normal.ex16;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
        int[] output = reverseArr(num);
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }

    public static int[] reverseArr(int[] arr){
        if (arr.length == 0) return arr;

        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        int[] result = new int[head.length + tail.length];
//        result = Arrays.copyOfRange(head,0,head.length);
//        result = Arrays.copyOfRange(tail,head.length,tail.length);
        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(tail, 0, result, head.length, tail.length);

        return result;
    }
}

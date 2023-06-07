package daily.normal.ex26;

import java.util.Arrays;

public class Mon {
    public static void main(String[] args) {
        int[] test = new int[]{3,1,2,3};
        System.out.println(solution(test));

    }

    public static int solution(int[] nums) {
        int choiceMon = nums.length/2;

        nums = Arrays.stream(nums).distinct().toArray();

        if(nums.length < choiceMon) return nums.length;


        return choiceMon;
    }
}

package daily.normal.ex12;

import java.util.ArrayList;
import java.util.Arrays;

public class GCD {
    public static void main(String[] args) {

        for(Integer[] test : divideChocolateStick(4,8)){
            System.out.println(Arrays.toString(test));
        }
    }
    public static ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        ArrayList<Integer[]> result = new ArrayList<>();
        Integer[] solution;

        for(int i = 2; i <= N; i++) {
            int gcdM = Gcd(M,i);
            int gcdN = Gcd(N,i);

            if(gcdN == 0 || gcdM ==0) continue;

            solution = new Integer[]{i,M/gcdM,N/gcdN};
            result.add(solution);
        }
        return result;
    }

    public static int Gcd(int M, int N) {
        //a % b = r
        //b % r = r'
        //r % r' = 0
        //return r'
        if(N==1) return 0;
        else if(M%N==0) return N;



        int value = M%N;
        return Gcd(N,value);
    }
}

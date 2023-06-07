package daily.solvedAc.class2.step1.구현.해싱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        String alphabet = bf.readLine();
        long sum = 0;
        long pow = 1;
        int mod = 1234567891;
        for (int i = 0; i < alphabet.length(); i++) {
            int alphabetNum = (alphabet.charAt(i) - 97) + 1;
            sum += alphabetNum * pow % mod;
            pow = pow * 31 % mod;
        }
        sum %= mod;
        System.out.println(sum);
    }
}

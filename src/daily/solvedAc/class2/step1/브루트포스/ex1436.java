package daily.solvedAc.class2.step1.브루트포스;
// 영화감독 숌
// 숌이 영화 제목을 666이라고 지었다
// 이 영화의 시리즈는 666, 1666, 2666, 3666...
// N 번째의 영화 제목을 출력하라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);
    }
}
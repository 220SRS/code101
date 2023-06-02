package daily.solvedAc.class2.step1.수학.사칙연산;

// ACM 호텔
// ACM 호텔 매니저 지우
// 손님이 도착하는 대로 빈 방을 배정한다
// 호텔 정문으로 부터 걸어서 가장 짧은 거리에 있는 방을 선호
// 손님이 오는 순서대로 101호, 201호, 301호... 이런식으로 배정
// 입력값
// T (테스트 개수 )
// H W N (호텔의 층 수, 각 층의 방 수, 몇 번째 손님 )
// 그럼 N번째 손님에게 배정되는 방번호를 구하라
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int H = Integer.parseInt(st.nextToken());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());
            int que = N / H;
            int rem = N % H;
            if(rem == 0) {
                System.out.println((H * 100) + que);
            } else {
                System.out.println((rem) * 100 + que + 1);
            }
        }
    }
}

package daily.programmers.greedy;
// 체육복
// 도둑이 들어 체육복을 훔쳐감
// 체육복을 빌릴 수 있는데 학생 번호 순이
// 체격이 비슷 사람들이라 자기 번호의
// 앞 혹은 뒤번호에게만 빌릴 수 있다.

// 전체 학생 수 n
// 체육복을 도난 당한 학생들 번호가 담긴 배열 lost
// 여벌 체육복 학생수 번호 reserve
// 이때 체육수업을 들을 수 있는 학생의 쵀댓값 리턴

// 전체 학생 수는 2명 이상 30명 이하
// 도난당한 학생 1명 이상 n명 이하 중복 X
// 여벌 학생 위와 동일
// 단 한명에게만 빌려주기 가능
// 여벌 학생도 도난 당할 수 있음
public class greedy1 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int n1 = 4;
        int[] lost1 = {2,3};
        int[] reserve1 = {3,4};
        int n2 = 3;
        int[] lost2 = {3};
        int[] reserve2 = {1};


        System.out.println(solution(n,lost,reserve));
        System.out.println(solution(n1,lost1,reserve1));
        System.out.println(solution(n2,lost2,reserve2));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        int count = reserve.length + n - lost.length - reserve.length;
        for (int i = 0; i < lost.length; i++) {
            int lostStudent = lost[i];
            for (int j = 0; j < reserve.length; j++) {
                if(Math.abs(lostStudent - reserve[j]) == 1) {
                    count++;
                    reserve[j] = 0;
                    break;
                }
            }
        }
        return count;
    }
}
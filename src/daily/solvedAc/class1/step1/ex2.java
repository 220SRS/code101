package daily.solvedAc.class1.step1;


//음계
// 다장조는 c d e f g a b C 총 8개다
// 각각 숫자로 변환하며 처음 부터 1 2 3 4 5 6 7 8 이다
// 순서대로라면 ascending, 역순이면 descending, 섞이면 mixed를 출력하라
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        switch (data) {
            case "1 2 3 4 5 6 7 8":
                System.out.println("ascending");
                break;
            case "8 7 6 5 4 3 2 1":
                System.out.println("descending");
                break;
            default:
                System.out.println("mixed");
                break;
        }
    }
}

package daily.normal.ex29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryNum {
    //백준 3460번 이진수
    // 양의 정수 N이 주어졌을때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램
    // 최하의 비트의 위치는 0
    // 11을 이진수로 표현하면 1011인데 여기서의 1의 위치를 표현 -> 0 2 3
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int T = scanner.nextInt();
//        int n = scanner.nextInt();
//        scanner.close();
//
//        List<Integer> location = new ArrayList<>();
//        int quotient = n;
//
//        for(int i = 0; quotient != 0; i++) {
//            if(quotient % 2 == 1) {
//                location.add(i);
//                System.out.println(i);
//            }
//            quotient /= 2;
//        }
//
//
//        for (int i = 0; i < location.size(); i++) {
//            if(location.size()-1 == i) System.out.print(location.get(i));
//
//            else System.out.printf("%d ", location.get(i));
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        List<String> binaryList = new ArrayList<>();

        for(int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            String binary = "";

            while(n != 1) {
                binary += n%2;
                n /= 2;
            }
            binary += n;
            binaryList.add(binary);

        }

        for (String binary : binaryList) {
            for (int i = 0; i < binary.length(); i++) {
                if(binary.charAt(i) == '1') {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

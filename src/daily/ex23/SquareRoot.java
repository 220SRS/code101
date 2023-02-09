package daily.ex23;

class SquareRoot {
    public static void main(String[] args) {
        String output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot(6);
        System.out.println(output); // --> "2.45"
    }

    public static String computeSquareRoot(int num) {
        // 수를 입력 받아 제곱근 값을 소수점 두 자리까지 리턴하라
        // Math.sqrt 사용 금지
        //제곱근을 구하는 방법 중 바빌로니아 법의 점화식
        // 소수점 처리 : java decimal places limit

//        double test = (1/2) * (1 + num/1);
//        System.out.println(test);
//        double test2 = (1/2) * (test + num/test);
//        System.out.println(test2);
//        return String.format("%.2f", test2);
//
//
////
//        //소수점 3자리부터 반올림하기 때문에, 배열에 소수점 자리만큼 double값을 선언, 할당합니다.
//        double[] diffs = new double[]{1, 0.1, 0.01, 0.001};
//        //초기값을 1로 설정합니다.
//        double base = 1;
//
//        //선언한 배열을 순회합니다.
//        for(int i = 0; i < diffs.length; i++) {
//            //초기값을 곱했을때, 입력된 값보다 작다면
//            while (base * base < num) {
//                //기본값에 배열의 인자(소숫점 초기값)을 더해줍니다.
//                base = base + diffs[i];
//            }
//            //모두 더한 값이 입력된 num과 일치한다면 (더이상 낮은 숫자를 비교할 필요가 없을 경우)
//            if(base * base == num) {
//                //String.format을 사용하여 소수점 2자리까지의 값을 String값으로 변환하여 리턴합니다.
//                return String.format("%.2f", base);
//            }else {
//                //기본 값에서 배열의 인자를 제외합니다
//                //제외하여야 배열의 인자가 바뀌고, while문이 정상적으로 순회가 가능합니다.
//                base = base - diffs[i];
//            }
//        }
//        //String.format을 사용하여 소수점 2자리까지의 값을 String값으로 변환하여 리턴합니다.
//        return String.format("%.2f", base);

        // while문으로 바빌로니아 법의 공식을 돌린다.
        // 조건은 일정 횟수가 지나면 멈추도록 설정한다.
        // 왜냐하면 입력값이 머가 들어올지 모르기 때문에 제일 근접한 값이 날올 때까지
        // 반복한 뒤에 소수점 두번째 자리 까지 구한다.

        double result = 1;
        int cnt = 0;

        while(true) {
            if (cnt == 40) {
                return String.format("%.2f",result);
            }
            else {
                result = (result + (num / result)) / 2;
            }
            cnt++;
        }
    }
}

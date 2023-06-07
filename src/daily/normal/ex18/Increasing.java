package daily.normal.ex18;

class Increasing {
    public static void main(String[] args) {
//        boolean output = superIncreasing(new int[]{1, 3, 6, 13, 54});
//        System.out.println(output);

//        boolean output1 = superIncreasing(new int[]{-2247, 1093, 1064});
//        System.out.println(output1);

        boolean output2 = superIncreasing(new int[]{1,2,4,8,15});
        System.out.println(output2);
    }
    public static boolean superIncreasing(int[] arr) {
        //arr[i]는 앞선 숫자들의 합보다 커야한다.

        // 박스에 숫자를 하나씩 담으며 더한다.
        // 박스와 다음 숫자를 비교한다.
        // 크면 넘어가서 그대로 진행 아니면 False로 return;

        // 재귀 어렵군 / for문 쉽게 가자

//        int sum = 0;
//
//        for (int value : arr) {
//            if (sum < value) {
//                sum += value;
//            }
//
//            else if(sum > value) {
//                return false;
//            }
//        }
//
//        return true;

        int sum = 0;

        for (int value : arr) {
            if (sum < value) {
                sum += value;
            }

            else if(sum >= value) {
                if(sum == 0) {
                    sum += value;
                    continue;
                }

                return false;
            }
        }

        return true;
    }
}

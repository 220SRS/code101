package daily.normal.ex11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BlackJack {
    public static void main(String[] args) {
        System.out.println(boringBlackjack(new int[]{2, 4, 6, 9, 13}));
    }

    public static int boringBlackjack(int[] cards) {
        // TODO:
        //1. 숫자로 이루어진 카드를 여러 장 받습니다.
        //2. 3장씩 카드를 고르고, 3장에 적힌 숫자들의 합이 소수인지 확인합니다.
        //3. 받아든 카드로 만들 수 있는 소수의 개수가 많은 사람이 이기게 됩니다.

        ArrayList<Integer> listSum = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < cards.length-2; i++) {
            for (int j = i + 1; j < cards.length-1; j++) {
                for (int z = j + 1; z < cards.length; z++) {
                    listSum.add(cards[i] + cards[j] + cards[z]);
                }
            }
        }

        List<Integer> collect = listSum.stream().distinct().collect(Collectors.toList());

        for (int value : collect) {
            boolean bool = true;
            for (int i = 2; i < value / 2; i++) {
                if (value % i == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) cnt++;
        }
        return cnt;
    }
}

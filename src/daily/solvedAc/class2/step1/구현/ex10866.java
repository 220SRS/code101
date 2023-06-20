package daily.solvedAc.class2.step1.구현;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.StringTokenizer;

public class ex10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        List<Integer> cardDeck = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    cardDeck.add(0, Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    cardDeck.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (cardDeck.size() == 0) {
                        System.out.println(-1);
                    }
                    else {
                        int num = cardDeck.get(0);
                        cardDeck.remove(0);
                        System.out.println(num);
                    }
                    break;
                case "pop_back":
                    if (cardDeck.size() == 0) {
                        System.out.println(-1);
                    }
                    else {
                        int num = cardDeck.get(cardDeck.size() - 1);
                        cardDeck.remove(cardDeck.size() - 1);
                        System.out.println(num);
                    }
                    break;
                case "size":
                    System.out.println(cardDeck.size());
                    break;
                case "empty":
                    if (cardDeck.size() != 0) {
                        System.out.println(0);
                    }
                    else {
                        System.out.println(1);
                    }
                    break;
                case "front":
                    if (cardDeck.size() == 0) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(cardDeck.get(0));
                    }
                    break;
                case "back":
                    if (cardDeck.size() == 0) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(cardDeck.get(cardDeck.size() - 1));
                    }
                    break;
            }
        }
    }
}
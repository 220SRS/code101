package daily.normal.ex01;

class Double {
    public static void main(String[] args) {
        Double.test();
    }

    private static void test() {
        double interrestRate = 7.0;

        calcurator(interrestRate);
    }

    private static int calcurator(double interrestRate) {

        int test = 1000;
        int count = 0;
        for (int i = 0; test <= 2000; i++) {
            test = test + (int) (test * (interrestRate / 100));
            System.out.println(test);
            count++;
            if (test == 2000) break;
        }
        System.out.println("-".repeat(60));
        System.out.println(count);
        return count;
    }
}

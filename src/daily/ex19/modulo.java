package daily.ex19;

public class modulo {
    public static void main(String[] args) {
        Integer output = modulo(-5,-3);
        System.out.println(output);

//        output = modulo(25, 0);
//        System.out.println(output);
    }
    public static Integer modulo(int num1, int num2) {

//        if (num2 == 0) return null;
//
//        num1 = Math.abs(num1);
//        num2 = Math.abs(num2);
//
//        if(num1 == 0 || num1 - num2 < 0) return num1;
//
//        return modulo(num1-num2, num2);

//        if (num2 == 0) return null;
//
//        long num1L = Math.abs(num1);
//        long num2L = Math.abs(num2);
//
//        if(num1L == 0 || num1L - num2L < 0) return (int) num1L;
//
//
//        return modulo((int) num1L, (int) num2L);

        if (num2 == 0) return null;

        while(num1 >= num2) {
            num1 = num1 - num2;
        }

        return num1;

    }

}

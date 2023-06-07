package daily.normal.ex09;

class DoubleSpace {
    public static void main(String[] args) {
        String data = "string  data  double  data";
        System.out.println(DoubleSpaceToSingle(data));

    }
    public static String DoubleSpaceToSingle(String str) {
        String result = str.replace("  ", " ");

        return result;
    }
}

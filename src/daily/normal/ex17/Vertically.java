package daily.normal.ex17;

class Vertically {
    public static void main(String[] args) {
        String[] input = new String[]{
                "he",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"
    }
    public static String readVertically(String[] arr) {

        int maxLength = 0;

        for(String data : arr) {
                maxLength = Math.max(maxLength, data.length());
        }

        String[] temp = new String[maxLength];
        for(String data : arr) {
            for(int j = 0; j < data.length(); j++) {
                if(temp[j] == null) {
                    temp[j] = Character.toString(data.charAt(j));
                } else {
                    temp[j] = temp[j] + data.charAt(j);
                }
            }
        }
        String result = "";
        for(String data : temp) {
            result += data;
        }

        return result;
    }

}
public class CodeWars {

        public static String seriesSum(int n) {
            float result = 1.0f;
            float series = 1.0f;
            if (n == 1) return "1";
            if (n == 0) return "0";
            for (int i = 1; i < n; i++) {
                series = series + 3;
                result = result + (1/series);
            }
            String finalResult = String.format( "%.2f", result );
            return finalResult;
        }

        public static String maskify(String input){
            char[] inputStr = input.toCharArray();
            if (inputStr.length < 4) return input;
            for (int i = 0; i < inputStr.length - 4; i++) {
                inputStr[i] = '#';
            }
            String result = String.copyValueOf( inputStr );
            return result;
        }

        public static String toCamelCase(String s){
            StringBuilder result = new StringBuilder(  );
            char[] inputStr = s.toCharArray();
            for (int i = 0; i < inputStr.length; i++) {
                if (inputStr[i] == '_' || inputStr[i] == '-'){
                    String ch = String.valueOf( inputStr[i+1] );
                    ch = ch.toUpperCase();
                    result = result.append( ch );
                    i++;
                } else {
                    result = result.append( inputStr[i] );
                }
            }
            return result.toString();
        }


    public static void main(String[] args) {
        System.out.println(toCamelCase( "river_side" ));
    }
}

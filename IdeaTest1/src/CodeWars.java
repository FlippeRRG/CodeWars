import java.util.List;

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
//      Given an array (arr) as an argument complete the function countSmileys that should return
//      the total number of smiling faces.
//
//      Rules for a smiling face:
//      -Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
//      -A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
//      -Every smiling face must have a smiling mouth that should be marked with either ) or D.
//      No additional characters are allowed except for those mentioned.
//      Valid smiley face examples:
//       :) :D ;-D :~)
//      Invalid smiley faces:
//      ;( :> :} :]

        public static int countSmileys(List<String> arr) {

            int result = 0;
            for (int i = 0; i < arr.size(); i++) {
                if ((arr.get( i ).length()<4) &&
                        (arr.get(i).charAt( 0 )==';' || arr.get(i).charAt( 0 )==':') &&
                        (arr.get( i ).endsWith( ")" ) || arr.get( i ).endsWith( "D" ))) {
                    result++;
                    if (arr.get( i ).length()==3 &&
                            !((arr.get( i ).charAt( 1 )=='-') || (arr.get( i ).charAt( 1 )=='~'))){
                        result--;
                    }
                }
            }
            return result;
        }


    public static void main(String[] args) {
        System.out.println(toCamelCase( "river_side" ));

    }
}

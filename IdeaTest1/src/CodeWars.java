import java.util.Arrays;
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

    public static int century(int number) {
        int result = number / 100;
        if(number % 100 > 0 || number < 100) result++;
        return result;
    }

   //    Return the number (count) of vowels in the given string.
//////
//////    We will consider a, e, i, o, and u as vowels for this Kata.
//////
//////    The input string will only consist of lower case letters and/or spaces.

    public static int getCount(String str) {
        int vowelsCount = 0;
       char[] inputStr = str.toCharArray();
        for (int i = 0; i <inputStr.length; i++) {
            if (inputStr[i]=='a' || inputStr[i]=='e' || inputStr[i]=='i' || inputStr[i]=='o' || inputStr[i]=='u') vowelsCount++;
        }
        return vowelsCount;
    }

    public static String insertMissingLetters(String str) {
        // Your code here
        char[] m = new char[26];
        for (int i=0; i< 26; i++) {
            m[i] = (char)('A' + i);
        }
        int count = 0;
        String alphaBet = String.copyValueOf( m );
        String alphaBetLC = alphaBet.toLowerCase();
        char[]input = str.toCharArray();
        StringBuilder result = new StringBuilder(  );
        for (int i = 0; i < str.length(); i++) {
            result.append( input[i] );

                if (input[i-count]==input[i] && i > 0){

                } else {
                    for (int j = 0; j < alphaBet.length(); j++) {
                        if (input[i] == alphaBetLC.charAt( j )){
                            String alphaBetToSubstring = alphaBet.substring( j+1 );
                            alphaBetToSubstring = alphaBetToSubstring.toLowerCase();
                            for (int k = 0; k < str.length(); k++) {
                                int index = alphaBetToSubstring.indexOf( str.charAt( k ) );
                                if (index < 0) {

                                } else {

                                    alphaBetToSubstring = alphaBetToSubstring.substring( 0, index ) + alphaBetToSubstring.substring(index+1);
                                }
                            }
                            count = 1;
                            result.append(alphaBetToSubstring.toUpperCase());
                        }
                    }
                }
            }

        return String.valueOf( result );
    }

    public static boolean casino(){
            double start1 = 93.7;
        for (int i = 0; i < 700; i++) {
            double start = start1;
            while(start > 0){
                start = (start * 2) - 100;
            }
            System.out.println(start);
            if(start==0) {
                System.out.println(start1);
                return true;
            } else {
                start1 = start1 + 0.01;
            }
        }
        System.out.println("Хрен там был!");
        return false;
    }

    private static void arrDivision(int[]arr){
            int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 2 == 0){
            int check = 0;
            for (int i = 0; i < arr.length; i++) {
                check += arr[i];
                if (sum / 2 == check) {
                    System.out.println( Arrays.toString( Arrays.copyOfRange( arr, 0, i+1 ) ) + " | | "
                            + Arrays.toString( Arrays.copyOfRange( arr, i+1, arr.length ) ) );
                    break;
                }
            }
            System.out.println("Нет места делящего массив пополам!");
        } else {
            System.out.println("Нет места делящего массив пополам!");
        }
    }

        public static String repeatStr(final int repeat, final String string) {
            String result = "";
            for (int i = 0; i < repeat; i++) {
                result += string;
            }
            return result;
        }
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i] < array[j] && array[i] % 2 !=0 && array[j] % 2 !=0){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString( array ));
        return array;
    }


    public static void main(String[] args) {
        sortArray( new int[]{ 5, 3, 2, 0, 1, 4 } );
    }
}

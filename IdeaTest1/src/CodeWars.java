import java.util.*;

public class CodeWars {

    public static String seriesSum(int n) {
        float result = 1.0f;
        float series = 1.0f;
        if (n == 1) return "1";
        if (n == 0) return "0";
        for (int i = 1; i < n; i++) {
            series = series + 3;
            result = result + (1 / series);
        }
        String finalResult = String.format( "%.2f", result );
        return finalResult;
    }

    public static String maskify(String input) {
        char[] inputStr = input.toCharArray();
        if (inputStr.length < 4) return input;
        for (int i = 0; i < inputStr.length - 4; i++) {
            inputStr[i] = '#';
        }
        String result = String.copyValueOf( inputStr );
        return result;
    }

    public static String toCamelCase(String s) {
        StringBuilder result = new StringBuilder();
        char[] inputStr = s.toCharArray();
        for (int i = 0; i < inputStr.length; i++) {
            if (inputStr[i] == '_' || inputStr[i] == '-') {
                String ch = String.valueOf( inputStr[i + 1] );
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
            if ((arr.get( i ).length() < 4) &&
                    (arr.get( i ).charAt( 0 ) == ';' || arr.get( i ).charAt( 0 ) == ':') &&
                    (arr.get( i ).endsWith( ")" ) || arr.get( i ).endsWith( "D" ))) {
                result++;
                if (arr.get( i ).length() == 3 &&
                        !((arr.get( i ).charAt( 1 ) == '-') || (arr.get( i ).charAt( 1 ) == '~'))) {
                    result--;
                }
            }
        }
        return result;
    }

    public static int century(int number) {
        int result = number / 100;
        if (number % 100 > 0 || number < 100) result++;
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
        for (int i = 0; i < inputStr.length; i++) {
            if (inputStr[i] == 'a' || inputStr[i] == 'e' || inputStr[i] == 'i' || inputStr[i] == 'o' || inputStr[i] == 'u')
                vowelsCount++;
        }
        return vowelsCount;
    }

    public static String insertMissingLetters(String str) {
        // Your code here
        char[] m = new char[26];
        for (int i = 0; i < 26; i++) {
            m[i] = (char)('A' + i);
        }
        int count = 0;
        String alphaBet = String.copyValueOf( m );
        String alphaBetLC = alphaBet.toLowerCase();
        char[] input = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append( input[i] );

            if (input[i - count] == input[i] && i > 0) {

            } else {
                for (int j = 0; j < alphaBet.length(); j++) {
                    if (input[i] == alphaBetLC.charAt( j )) {
                        String alphaBetToSubstring = alphaBet.substring( j + 1 );
                        alphaBetToSubstring = alphaBetToSubstring.toLowerCase();
                        for (int k = 0; k < str.length(); k++) {
                            int index = alphaBetToSubstring.indexOf( str.charAt( k ) );
                            if (index < 0) {

                            } else {

                                alphaBetToSubstring = alphaBetToSubstring.substring( 0, index ) + alphaBetToSubstring.substring( index + 1 );
                            }
                        }
                        count = 1;
                        result.append( alphaBetToSubstring.toUpperCase() );
                    }
                }
            }
        }

        return String.valueOf( result );
    }

    public static boolean casino() {
        double start1 = 93.7;
        for (int i = 0; i < 700; i++) {
            double start = start1;
            while (start > 0) {
                start = (start * 2) - 100;
            }
            System.out.println( start );
            if (start == 0) {
                System.out.println( start1 );
                return true;
            } else {
                start1 = start1 + 0.01;
            }
        }
        System.out.println( "Хрен там был!" );
        return false;
    }

    private static void arrDivision(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % 2 == 0) {
            int check = 0;
            for (int i = 0; i < arr.length; i++) {
                check += arr[i];
                if (sum / 2 == check) {
                    System.out.println( Arrays.toString( Arrays.copyOfRange( arr, 0, i + 1 ) ) + " | | "
                            + Arrays.toString( Arrays.copyOfRange( arr, i + 1, arr.length ) ) );
                    break;
                }
            }
            System.out.println( "Нет места делящего массив пополам!" );
        } else {
            System.out.println( "Нет места делящего массив пополам!" );
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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j] && array[i] % 2 != 0 && array[j] % 2 != 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    int a = 0;
                    int b = 0;

                }
            }
        }
        return array;
    }

    public static int sequence(int[] arr) {
        int result = 0;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) result = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                if (temp > result) {
                    result = temp;
                }
            }
        }
        return result;
    }

    //    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//    Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
    public static int solution(int number) {
        int result = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) result += i;
        }
        return result;
    }

    //    Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.
//
//    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//    If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.
//
//    For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
    public static String order(String words) {
        String[] wordArr = words.split( " " );
        StringBuilder result = new StringBuilder( "" );
        for (int i = 0; i < 10; i++) {
            for (String t : wordArr) {
                if (t.contains( String.valueOf( i ) )) result.append( t ).append( " " );
            }
        }
        return new String( result ).trim();
    }

    public static void sumof2() {
        Scanner scanner = new Scanner( System.in );
        int a = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < a; i++) {
            res += scanner.nextInt();
        }
        System.out.println( res );
    }

    public static void reverseList() {
        Scanner scanner = new Scanner( System.in );
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] res = new int[a];
        res[0] = 1;

        int result = arr[0];
        for (int i = 1; i < a; i++) {
            if (result == 0) {
                break;
            } else {
                res[i] = result;
                result = arr[result - 1];
            }
        }
        for (int i = res.length - 1; i >= 0; i--) {
            System.out.print( res[i] );
        }
    }

//    11
//+alex
//+alex
//+ivan
//+alex
//+alex
//+alex
//+ivan
//+alex
//+ivan
//+ivan
//+ivan

//    10
//+a
//+a
//+a
//+a
//+b
//+b
//+b
//+b
//+b
//+a
//Сервер поддерживает одновременно до 4х коннектов с одинаковым именем,
// если коннектится 5й юзер с таким же именем, то первый вылетает о чем сервер сообщает в консоль.


    public static void chatServ() {
        Scanner scanner = new Scanner( System.in );
        int a = scanner.nextInt();
        int counter = 0;
        String[] timeOfWork = new String[a];
        scanner.nextLine();
        for (int i = 0; i < a; i++) {
            String tests = scanner.nextLine();
            timeOfWork[i] = tests;
        }
        for (int i = 0; i < timeOfWork.length - 3; i++) {
            String s = "";
            int numberOfString = i + 3;
            if (numberOfString < timeOfWork.length) {
                s = timeOfWork[numberOfString];
            }
            for (int j = numberOfString - 1; j >= 0; j--) {
                if (timeOfWork[j].equals( s )) counter++;
                if (counter == 4) {
                    System.out.println( "Disconnected " + s );
                    break;
                }
            }
            counter = 0;
        }
    }

//    You are going to be given a word. Your job is to return the middle character of the word.
// If the word's length is odd, return the middle character. If the word's length is even,
// return the middle 2 characters.

    public static String getMiddle(String word) {
        if (word.length() == 1) return word;
        int middle = word.length();
        if (middle % 2 == 0) {
            String result = word.substring( middle / 2 - 1, middle / 2 + 1 );
            return result;
        } else {
            String result = String.valueOf( word.charAt( middle / 2 ) );
            return result;
        }
    }

//    Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java)
// for strings. All words must have their first letter capitalized without spaces.

    public static String camelCase(String str) {
        if("".equals( str )) return "";
        str = str.trim();
        String[] arr = str.split( " " );
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if(!"".equals( s )){
                s = s.substring( 0, 1 ).toUpperCase() + s.substring( 1 );
                result += s;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(camelCase( "ab  c" ));

    }
}

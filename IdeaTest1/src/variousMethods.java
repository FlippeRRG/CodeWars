public class variousMethods {

    private static int diff (int angle1, int angle2){
        if (angle1 <= 360 && angle2 <= 360 && angle1 >= 0 && angle2 >= 0) {
            int diff = angle1 - angle2;
            diff = Math.abs( diff );
            if (diff <= 180 ) {
                return diff;
            } else {
                return 360 - diff;
            }
        } else {
            return 0;
        }
    }

    private static boolean isPerfect(int number){
        if (number < 0){
            return false;
        }
        int result = 0;
        for (int i = 1; i < number/2 + 1; i++) {
            if (number % i == 0 ){
                result = result + i;
            }
        }
        return (number == result);
    }
    
    private static int sumSquareDifference(int number){
        number = Math.abs( number );
        int sumSquare = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sumSquare = sumSquare + i*i;
            sum = sum + i;
        }
        sum = sum * sum;
        int difference = sum - sumSquare;
        return difference;
    }

    private static void fizzBuzz (int begin, int end){
        for (int i = begin; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuZZ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static int reverseInt (int enter){
        Integer res = enter;
        String temp = res.toString();
        String result = "";
        if (enter < 0) result = "-";
        for (int i = temp.length()-1; i >= 0 ; i--) {
            result = result + temp.charAt( i );
        }
        if (result.endsWith( "-" )) result = result.substring( 0, result.length()-1 );
        Integer result1 = Integer.parseInt( result );
        return result1;
    }

    public static String invertCase(String enterString){
        char[] enter = enterString.toCharArray();
        String ch;
        String result = "";
        for (int i = 0; i < enter.length; i++) {
            ch = "" + enterString.charAt( i );
            if (ch.equals( ch.toLowerCase() )) {
                result = result + ch.toUpperCase();
            } else {
                result = result + ch.toLowerCase();
            }
        }
        return result;
    }


    public static String formattedTime (int minutesFromBeginningOfDay){
        if (minutesFromBeginningOfDay < 0) return "0";
        String result = "0";
        int minutes = minutesFromBeginningOfDay % 60;
        int hours = minutesFromBeginningOfDay / 60;
        if (hours < 24 ){
            result = String.format( "%02d.%02d", hours, minutes );
        } else {
            int days = hours / 24;
            hours = hours % 24;
            result = String.format( "%02d.%02d.%02d", days, hours, minutes );
        }
        return result;
    }

    public static boolean isHappyTicket(int number){
        if (number > 999999 || number < 100000) return false;
        int firstPart = number / 1000;
        int secondPart = number % 1000;
        if (firstPart == secondPart) return true;
        int sumFP = 0;
        int sumSP = 0;
        for (int i = 0; i < 3; i++) {
            sumFP = sumFP + (firstPart % 10);
            firstPart = firstPart / 10;
            sumSP = sumSP + (secondPart % 10);
            secondPart = secondPart / 10;;
        }

        return (sumFP == sumSP);
    }

    public static void main(String[] args) {
        System.out.println(isHappyTicket( 385916 ));
        System.out.println(isHappyTicket( 123321 ));
        System.out.println(isHappyTicket( 145334 ));
        System.out.println(isHappyTicket( 951555 ));
    }
}

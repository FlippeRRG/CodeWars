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

    private static void main(String[] args) {
        System.out.println(diff(200, 0));
        System.out.println(isPerfect( 28 ));
        System.out.println(isPerfect( 6 ));
        System.out.println(isPerfect( 496 ));
        System.out.println(isPerfect( 8128 ));
        System.out.println(isPerfect( 4 ));
        System.out.println(isPerfect( 475467 ));
    }
}

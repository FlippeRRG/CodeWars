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

    public static void main(String[] args) {
        System.out.println(diff(200, 0));
    }
}

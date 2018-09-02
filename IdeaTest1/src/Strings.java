import java.util.ArrayList;
import java.util.List;

public class Strings {
    /** invert the string
     * 	example:
     *	- input: "input string"
     *	- output: "gnirts tupni"
     **/
    public String task1(final String in) {
        // BEGIN (write your solution here)
        char[] input = in.toCharArray();
        char[] result = new char[input.length];
        int j = 0;
        for (int i = input.length -1; i >= 0; i--) {
            result[j] = input[i];
            j++;
        }
        String out = String.copyValueOf( result );
        List<String> result12 = new ArrayList<String>();
        return out;
        // END
    }

    /** invert the tokens int the string
     * 	example:
     *	- input: "input string to the method test2"
     *	- output: "tupni gnirts ot eht dohtem 2tset"
     **/
    public String task2(final String in) {
        // BEGIN (write your solution here)
        char[] input = in.toCharArray();

        StringBuilder res = new StringBuilder(  );
        int j = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' '){
                res.append( task1( in.substring( j, i ) ) );
                res.append( " " );
                j = i+1;
                i++;
            } else if (i == input.length-1){
                res.append( task1( in.substring( j,i+1 ) ) );
            }
        }
        return String.valueOf( res );
        // END
    }

    /** count the target character in the String
     * 	example:
     *	- input: "input string to the method test2", 't'
     *	- output: 7
     **/
    public int task3(final String in, final char target) {
        // BEGIN (write your solution here)
        char[] input = in.toCharArray();
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) result++;
        }
            return result;
        // END
    }

    public int fromString(final char[] chars) {
        if(chars.length==0) return 0;
        if (chars.equals( null )) return 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            res.append( chars[i] );

        }
        int result = Integer.parseInt( String.valueOf( res ) );
        return result;
    }


}

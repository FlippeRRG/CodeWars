import java.util.stream.Stream;

public class HackerRank {


    public int sockMerchant(int n, int[] ar) {

        int counterOfPairs = 0;
        for (int i = 0; i < ar.length; i++) {
            int counter = 1;
            int sock = ar[i];
            ar[i] = 0;
            for (int j = 1; j < ar.length; j++) {
                if (sock == 0) break;
                if (sock == ar[j]) {
                    counter++;
                    ar[j] = 0;
                }
            }
            if (counter > 1) counterOfPairs += counter / 2;
        }
        return counterOfPairs;
    }

    public int countingValleys(int n, String s) {
        char[] arr = s.toCharArray();
        int counter = 0;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == 'U') {
                result[i] = ++counter;
            }
            if (c == 'D') {
                result[i] = --counter;
            }
        }
        int res = 0;

        for (int i = 1; i < arr.length; i++) {
            if (result[i] == 0 && result[i - 1] == -1) {
                res++;
            }
        }
        return res;
    }


    public int jumpingOnClouds(int[] c) {
        int steps = 0;
        int position = 0;
        while (position < c.length-1) {
            if(c.length-1<position+2){
                steps++;
                break;
            }
            if (c[position + 2] == 1) {
                position++;
                steps++;
            } else {
                position += 2;
                steps++;
            }
        }
        return steps;
    }

}

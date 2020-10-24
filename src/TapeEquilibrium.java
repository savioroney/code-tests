import java.util.Arrays;

public class TapeEquilibrium {

    public static void main(String[] args) {

        int[] A = {3,1,2,4,3};
        long sumTotal = 0;
        for (int j : A) {
            sumTotal += j;
        }

        long sum1 = 0;
        long sum2;
        int minDiff = Integer.MAX_VALUE;
        int currDiff;

        for(int P = 0; P < A.length - 1; P++) {
            sum1 += A[P];
            sum2 = sumTotal - sum1;
            currDiff = (int) Math.abs(sum1 - sum2);
            minDiff = Math.min(currDiff, minDiff);
        }

        System.out.println(minDiff);
    }
}

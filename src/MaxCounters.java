import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {
        //int N = 1;
       // int[] A = {2, 1, 1, 2, 1};
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] counters = new int[N];
        int conditional = N + 1;
        int maxCounters = 0;

        for(int i = 0; i < A.length; i++) {

            if (A[i] <= N) {
                counters[A[i] - 1]++;
                if(maxCounters < counters[A[i] - 1]) {
                    maxCounters = counters[A[i] - 1];
                }
            }

            if(A[i] == conditional) {
                int len = counters.length;
                counters[0] = maxCounters;
                for (int c = 1; c < len; c+=c) {
                    System.arraycopy(counters, 0, counters, c, Math.min((len - c), c));
                }
            }
        }

        System.out.println(Arrays.toString(counters));
    }
}

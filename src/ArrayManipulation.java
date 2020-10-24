import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        //int n = 10;
        //int[][] queries = {{1,5,3}, {4,8,7}, {6,9,1}};
        // 10
        //int n = 5;
        //int[][] queries = {{1,2,100}, {2,5,100}, {3,4,100}};
        // 200
        int n = 4;
        int[][] queries = {{2,3,603}, {1,1,286}, {4,4,882}};
        // 882

        long[] A = new long[n];

        for (int[] query : queries) {
            if(1 <= query[0] && query[0] <= query[1]) {
                for (int i = query[0] ; i <= query[1]; i++) {
                    if(i <= n) A[i] += query[2];
                }
            }
        }

        System.out.println(Arrays.stream(A).max().getAsLong());
    }
}

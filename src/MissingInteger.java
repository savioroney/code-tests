import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class MissingInteger {

    public static void main(String[] args) {

        // 1 -> 2
        // 2 -> 1
        // 4, 5, 6, 2 -> 1
        // 1, 3, 6, 4, 1, 2 -> 5
        // 1, 2, 3 -> 4
        // -1, -3 -> 1
        int[] A = {1, 3, 6, 4, 1, 2};

        if(A.length ==0){
            System.out.print(1);
            System.exit(0);
        }

        Set<Integer> entrySet = new HashSet();

        for(int i=0; i< A.length; i++){
            entrySet.add(A[i]);
        }

        for(int i=1; i<= A.length; i++){
            if(!entrySet.contains(i)) {
                System.out.print(i);
                System.exit(0);
            }
        }

        System.out.print(A.length+1);
    }
}

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {
        int X = 3;
        int[] A = {1, 3, 1, 3, 2, 1, 3};

        Set positions = new HashSet();
        for (int i = 1; i <= X; i++) {
            positions.add(i);
        }

        Set currPositions = new HashSet();

        for(int i = 0; i < A.length; i++) {
            currPositions.add(A[i]);

            if(positions.size() > currPositions.size()) continue;

            if(currPositions.containsAll(positions)) {
                System.out.println(i);
                break;
            }
        }

        System.out.println(-1);
    }
}

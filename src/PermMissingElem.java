import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {

        int[] A = {2,1,3,4};

        Arrays.sort(A);

        for(int i = 0; i <= A.length; i++) {
            if(i == A.length) {
                System.out.println(i + 1);
                break;
            }

            if (i + 1 != A[i]) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

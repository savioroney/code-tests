public class ArrayRotation {

    public static void main(String[] args) {

        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        for(int i=0; i < K; i++) {
            for(int j = A.length - 1; j >= 0; j--) {
                if(j-1 >= 0) {
                    int aux = A[j];
                    A[j] = A[j-1];
                    A[j-1] = aux;
                }
            }
        }

        System.out.println(A);
    }
}

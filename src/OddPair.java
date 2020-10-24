import java.util.HashMap;
import java.util.Map;

public class OddPair {

    public static void main(String[] args) {

        int[] A = {9,3,9,3,9,7,9};

        Map<Integer, Integer> countPair = new HashMap();


        for(int key : A) {
            if (countPair.containsKey(key)) {
                countPair.put(key, countPair.get(key) + 1);
            } else {
                countPair.put(key, 1);
            }
        }

        int unpair = 0;
        for (Integer key : countPair.keySet()) {
            if(countPair.get(key) % 2 != 0) {
                unpair = key;
            }
        }

        System.out.println(unpair);
    }
}

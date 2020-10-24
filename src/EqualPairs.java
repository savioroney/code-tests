import java.util.HashMap;
import java.util.Map;


public class EqualPairs {

    public static void main(String[] args) {

        int[] items = {10,20,20,10,30,50,10,20,10};

        Map<Integer, Integer> counter = new HashMap();
        int pairs = 0;
        for(int i = 0; i < 9; i ++) {
            if(counter.get(items[i]) == null) {
                counter.putIfAbsent(items[i], 1);
            } else {
                counter.put(items[i], counter.get(items[i]) + 1);
            }
            if(counter.get(items[i]) % 2 == 0) pairs++;
        }

        System.out.println(counter);
        System.out.println(pairs);
    }
}

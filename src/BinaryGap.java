import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BinaryGap {

    public static void main(String[] args) {

        String binary = Integer.toBinaryString(15);
        char[] binaryArr = binary.toCharArray();

        List<Integer> gaps = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < binaryArr.length; i++) {

            if(i+1 < binaryArr.length) {

                if(binaryArr[i] == '1' && binaryArr[i+1] == '0') {
                    count++;
                }

                if(binaryArr[i] == '0' && binaryArr[i+1] == '0') {
                    count++;
                }

                if(binaryArr[i] == '0' && binaryArr[i+1] == '1') {
                    gaps.add(count);
                    count = 0;
                }
            }
        }

        System.out.println(gaps.stream().max(Integer::compare).orElse(0));
    }
}

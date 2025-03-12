package Leet_POTD;

import java.util.Arrays;

public class Maximum_of_pos_N_neg {
    public static int myFunction(int[] nums){
        long countPos = Arrays.stream(nums).filter(n->n>0).count();
        long countNeg = Arrays.stream(nums).filter(n->n<0).count();
        return (int)Math.max((int)countNeg,(int)countPos);
    }


}

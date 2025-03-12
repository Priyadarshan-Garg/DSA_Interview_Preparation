package Leet_POTD;

import java.util.Arrays;

public class Maximum_of_pos_N_neg {
    public static int myFunction(int[] nums){
        long countPos = Arrays.stream(nums).filter(n->n>0).count();
        long countNeg = Arrays.stream(nums).filter(n->n<0).count();
        return (int)Math.max((int)countNeg,(int)countPos);
    }

    public static void main(String[] args) {
        int [] nums = {-2,-1,-1,1,2,3};
        int [] nums2 = {-3,-2,-1,0,0,1,2};
        int [] nums3 = {5,20,66,1314};

        System.out.println(myFunction(nums2));

    }
}

package Questions;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int count = removeElement(nums, 2);

        System.out.println(count);

        System.out.println(Arrays.toString(nums));

    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0 ; i<nums.length ; i++ ) {
            if (nums[i] == val) {
                nums[i] = 0;
            }
            else {
                nums[count] = nums[i];
                if (i != count){
                     nums[i] = 0;
                }
                count++;
            }
        }
         return count;
    }
}

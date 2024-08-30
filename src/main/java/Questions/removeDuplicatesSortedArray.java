package Questions;

import java.util.Arrays;

public class removeDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] nums2 = new int[]{1,1,2};

        int solution = removeDuplicates(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(solution);
    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        if (nums.length>1){
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[count]) {
                    count ++;
                    nums[count] = nums[i];
                }
            }
        }
        return count+1;
    }
}

package Questions;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        //merge(nums1, m, nums2, n);
        //merge(new int[]{1}, 1, new int[]{0}, 0);
        merge(new int[]{4,5,6,0,0,0}, 3, new int[]{1,2,3}, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n>0 && m>0){
            int lastPosition = m+n-1;
            int num1Last = m-1;
            int num2Last = n-1;
            while (num2Last >= 0){
                if (num1Last < 0){
                    nums1[lastPosition]=nums2[num2Last];
                    num2Last --;
                    lastPosition --;
                }
                else if (nums2[num2Last] > nums1[num1Last]){
                    nums1[lastPosition] = nums2[num2Last];
                    num2Last--;
                    lastPosition--;
                } else if (nums1[num1Last] >= nums2[num2Last]) {
                    nums1[lastPosition] = nums1[num1Last];
                    nums1[num1Last] = 0;
                    num1Last --;
                    lastPosition--;
                }
            }
        } else if (m==0) {
            if (n - 1 + 1 >= 0) System.arraycopy(nums2, 0, nums1, 0, n - 1 + 1);
        }
        System.out.println(Arrays.toString(nums1));
    }
}

package Questions;

import java.util.Arrays;

public class TwoSum {

        public static void main(String[] args) {
            int[] inputs = {-3,4,3,90};
            TwoSum twoSum = new TwoSum();
            System.out.printf(Arrays.toString(twoSum.twoSum(inputs, 0)));

        }
    public int[] twoSum(int[] nums, int target) {
        int[] arr=Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        for (int number:arr){
                int secondValue=bisection(number,arr,target);
                if (secondValue!=-4313){
                    if (number==secondValue){
                        return findWhenDoubleOccurence(nums,number);
                    }
                    return new int[]{Arrays.binarySearch(nums,number),Math.abs(Arrays.binarySearch(nums,secondValue))};
                    //return new int[]{IntStream.range(0, nums.length).filter(i -> nums[i] == number).findFirst().orElse(-1),IntStream.range(0, nums.length).filter(i -> nums[i] == secondValue).findFirst().orElse(-1)};
                }
        }
        return null;
    }
    private int bisection(int initialValue,int[] nums, int target){
        if (nums.length<=1 && initialValue+nums[0]!=target){
            return -4313;
        }
        else if (initialValue+nums[nums.length/2]>target){
            return bisection(initialValue,Arrays.copyOfRange(nums,0,nums.length/2),target);
        }
        else if (initialValue+nums[nums.length/2]<target){
            return bisection(initialValue,Arrays.copyOfRange(nums,nums.length/2,nums.length),target);
        }
        return nums[nums.length/2];
    }
    private int[] findWhenDoubleOccurence(int[] array,int target){
        int[] arr={0,0};
        int index=0;
        for (int i=0;i<array.length;i++) {
            if (array[i]==target){
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
}

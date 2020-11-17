package src.practiceProblems.leetcode;

public class singleNumber136 {
    public static void main(String args[])
    {
        int[] nums = new int[]{2,2,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        boolean found = false;

        for(int i=0;i<nums.length;i++)
        {
            found = false;
            for(int j=0;j<nums.length;j++) {
                if ((nums[i] == nums[j]) && (i!=j)) {
                    found = true;
                }
                if (found == false)
                    return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}

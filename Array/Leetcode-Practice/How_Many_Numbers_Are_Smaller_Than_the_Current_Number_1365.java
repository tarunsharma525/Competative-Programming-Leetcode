public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365 {

    class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i] = count;
            
        }
        return ans;
        
    }
    public static void main(String[] args) {
        How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365 solution = new How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365();
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = solution.new Solution().smallerNumbersThanCurrent(nums);
        System.out.print("Smaller numbers than current: ");
        for (int num : result) {
            System.out.print(num + " ");
        }   
    }
}
}
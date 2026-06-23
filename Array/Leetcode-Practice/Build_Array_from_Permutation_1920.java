
public class Build_Array_from_Permutation_1920 {


    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0 ; i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Build_Array_from_Permutation_1920 obj = new Build_Array_from_Permutation_1920();
        int[] nums = {0,2,1,5,3,4};
        int[] ans = obj.buildArray(nums);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
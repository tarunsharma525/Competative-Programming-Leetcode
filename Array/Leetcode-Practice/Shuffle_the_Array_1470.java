class Shuffle_the_Array_1470{

    public int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[nums.length];
        for(int i=0;i<n;i++){
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[n+i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Shuffle_the_Array_1470 obj = new Shuffle_the_Array_1470();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = obj.shuffle(nums,n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

      
}
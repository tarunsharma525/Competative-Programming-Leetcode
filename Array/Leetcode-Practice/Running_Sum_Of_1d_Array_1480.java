
class Running_Sum_Of_1d_Array_1480 {

    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }

    public static void main(String[] args) {
        Running_Sum_Of_1d_Array_1480 obj = new Running_Sum_Of_1d_Array_1480();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = obj.runningSum(nums);
        System.out.println("Running Sum of 1D Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
public class Number_Of_Good_Pairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Number_Of_Good_Pairs_1512 solution = new Number_Of_Good_Pairs_1512();
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = solution.numIdenticalPairs(nums);
        System.out.println("Number of good pairs: " + result); 
    }


    

    
}

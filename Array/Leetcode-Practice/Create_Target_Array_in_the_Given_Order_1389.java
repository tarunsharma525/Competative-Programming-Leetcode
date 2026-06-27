import java.util.ArrayList;

public class Create_Target_Array_in_the_Given_Order_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            list.add(index[i] , nums[i]);
        }
        int[] target = new int[list.size()];
        for(int i =0;i<list.size();i++){
            target[i] = list.get(i);
        }
        return target;
        
    }
    public static void main(String[] args) {
        Create_Target_Array_in_the_Given_Order_1389 solution = new Create_Target_Array_in_the_Given_Order_1389();
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] result = solution.createTargetArray(nums, index);
        System.out.print("Target array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }       
    }
    
    }

    


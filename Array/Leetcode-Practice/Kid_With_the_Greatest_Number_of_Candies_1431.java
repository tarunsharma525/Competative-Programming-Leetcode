import java.util.ArrayList;
import java.util.List;

public class Kid_With_the_Greatest_Number_of_Candies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i = 1;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        ArrayList<Boolean> List = new ArrayList<>();
        for(int value : candies){
            if(value + extraCandies >= max){
                List.add(true);
            }
            else{
                List.add(false);
            }
        }
        return List;
    }
    public static void main(String[] args) {
        Kid_With_the_Greatest_Number_of_Candies_1431 obj = new Kid_With_the_Greatest_Number_of_Candies_1431();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);
        System.out.print("Result: ");
        for (Boolean res : result) {
            System.out.print(res + " ");
        }
    }
    
}

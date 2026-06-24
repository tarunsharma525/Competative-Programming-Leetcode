public class Richest_Customer_Wealth_1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        Richest_Customer_Wealth_1672 obj = new Richest_Customer_Wealth_1672();
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 2 } };
        int result = obj.maximumWealth(accounts);
        System.out.println("Richest Customer Wealth: " + result);               
    }
} 
    


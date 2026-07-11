class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int total = 0;
        for(int w : worker){
            int maxProfit = 0;
            for(int j = 0;j < difficulty.length ; j++){
                if(difficulty[j] <= w){
                    maxProfit = Math.max(maxProfit,profit[j]);
                }
            }
            total+= maxProfit;
        }
        return total;
    }
}
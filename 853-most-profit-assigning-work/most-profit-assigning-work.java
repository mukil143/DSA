class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int total = 0;
        for(int i = 0; i < worker.length ;i++){
            int cW = worker[i];
            int maxProfit = 0;
            for(int j = 0;j < difficulty.length ; j++){
                if(difficulty[j] <= cW){
                    maxProfit = Math.max(maxProfit,profit[j]);
                }
            }
            total+= maxProfit;
        }
        return total;
    }
}
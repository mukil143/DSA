class Solution {
    public int[][] generateMatrix(int n) {
        int [][]res = new int[n][n];
        int count = 1;
        int colS = 0;
        int colE = n - 1;
        int rowS = 0;
        int rowE = n - 1;

        while(colS <= colE && rowS <= rowE){
            for(int i = colS ; i <= colE;i++){
                res[rowS][i] = count++;
            }
            rowS++;
            for(int i = rowS; i <= rowE;i++){
                res[i][colE] = count++;
            }
            colE--;
            for(int i = colE;i>=colS;i--){
                res[rowE][i] = count++;
            }
            rowE--;
            for(int i = rowE ; i >=rowS;i--){
                res[i][colS] = count++;
            }
            colS++;
        }

        return res;

    }
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;//1
        int r = 0;//11
        for(int pile : piles) 
            r = Math.max(r,pile);

        while(l < r){
            int mid = l + (r - l) / 2;//6

            if(canFinish(piles,h,mid)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
    private boolean canFinish(int[] piles,int h, int speed){
        long hours = 0;

        for(int  pile : piles){
            hours += (pile +  speed  - 1) / speed;
        }

        return hours <= h;
    }
}
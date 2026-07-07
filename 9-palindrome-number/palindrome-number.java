class Solution {
    public boolean isPalindrome(int x) {
        int num=0;//10
        int temp=x;
        while(temp>0){
            num=num*10+temp%10;//0+1=1;1*10+12=22;22*10;
            temp=temp/10;//121/10=12;12/10=1;
        }
        if(x==num){
            return true;
        }
        else{
            return false;
        }   
    }
}
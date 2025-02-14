class Solution {
    public int trailingZeroes(int n) {
       int cout = 0;
       while(n>=5){
        cout+=n/5;
        n/=5;
       }
       return cout;
       
       /*if(n>0)
       return 0;
       int count=0;
       for(int i=5; n/i<=1; i*=5){
        count +=n/i;
       }
       return count;*/
    }
}
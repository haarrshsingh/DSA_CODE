class Solution {
    //Number of Subsequences
    static final int MOD = 1_000_000_007;
    public int numSubseq(int[] nums, int target) {
    Arrays.sort(nums);
    int n = nums.length;
    int left = 0, right = n-1;
    long count = 0;
    long[] power = new long[n];
    power[0] = 1;
    for(int i = 1; i< n; i++){
        power[i] = (power[i - 1]* 2) % MOD;
    }   
     while(left <= right){
        if(nums[left] + nums[right] <= target){
            count = (count + power[right - left]) % MOD;
            left ++;
        }
        else{
            right--;
        }
     }
     return (int) count;
    }
}
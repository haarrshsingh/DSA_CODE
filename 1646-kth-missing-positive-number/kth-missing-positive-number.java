class Solution {
    public int findKthPositive(int[] arr, int k) {
      int missingCount = 0, index=0, num=1;
      while(missingCount < k){
        if(index < arr.length && arr[index] == num){
            index++;
        }
        else{
            missingCount++;
            if(missingCount==k)
            return num;
        }
        num++;
      }
      return -1;  
    }
}
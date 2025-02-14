class Solution {
    public int fib(int n) {
    /*  int num =0;
      int num1 =1;
      for(int i=1; i<n; i++){
        System.out.println(num  + " ");
        
        int num2 = num + num1;
        num=num1;
        num1=num2;
        }
      return num1;*/
      if(n<=1)
      return n;
      return fib(n-1)+fib(n-2);
}
}
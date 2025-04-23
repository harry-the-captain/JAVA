class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor = xor ^ arr[i];
        }
        int setbit = xor & -xor;
        int num1 = 0;
        int num2 = 0;
        
        for(int i=0; i<arr.length; i++){
            if((arr[i] & setbit) != 0){
                num1 = num1 ^ arr[i];
            }
            else{
                num2 = num2 ^ arr[i];
            }
        }
        if(num1 < num2){
            return new int[]{num1, num2};
        }
        else{
            return new int[]{num2, num1};
        }
    }
}

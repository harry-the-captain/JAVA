class Solution {
    public int getSingle(int[] arr) {
       int result = 0;
       for(int i=0; i<32; i++){
           int sum = 0;
           int bits = 1 << i;
           for(int num : arr){
               if((num & bits) != 0){
                   sum++;
               }
           }
           if(sum % 3 != 0){
               result |= bits;
           }
       }
        return result;
    }
}

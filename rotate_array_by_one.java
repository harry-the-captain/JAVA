class Solution {
    public void rotate(int[] arr) {
        // code here
        int n=1;
        // for (int i = 0; i < arr.length; i++) {   
        //     System.out.print(arr[i] + " ");   
        // }    
          
        for(int i = 0; i < n; i++){  
            int j, last;  
            last = arr[arr.length-1];  
          
            for(j = arr.length-1; j > 0; j--){  
                arr[j] = arr[j-1];  
            }  
            arr[0] = last; 
        }
    }
}

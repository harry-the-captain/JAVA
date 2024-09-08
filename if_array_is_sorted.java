class Solution:
    def arraySortedOrNot(self, arr) -> bool:
        # code here
        # if len(arr) == 1:
        #         return True
                
        # for i in range(len(arr) - 1):
        #     if arr[i] > arr[i + 1]:
        #         return False
                
        #     return True
        
        if len(arr) <= 1:
            return True
        
        for i in range(len(arr) - 1):
            if arr[i] > arr[i + 1]:
                return False
        
        return True

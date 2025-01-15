class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int gap = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i=0; i<n-2; i++){
            int left = i + 1;
            int right = n-1;

            while(left < right){
                int ans = nums[i] + nums[left] + nums[right];

                if(ans < target){
                    int new_gap = target - ans;
                    if(new_gap < gap){
                        gap = new_gap;
                        res = ans;
                    }
                    left++;
                }
                else if(ans > target){
                    int new_gap = ans - target;
                     if(new_gap < gap){
                        gap = new_gap;
                        res = ans;
                    }
                    right--;
                }
                else{
                    return ans;
                }
            }
        }
        return res;
    }
}

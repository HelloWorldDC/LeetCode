class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = {0,0};
        for(int i = 0;i< nums.length;i++){
            for(int j = i+1;j< nums.length;j++){
                if(nums[i]+nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int min = 0;
        int check = 0;
        int vi_tri = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (check == 0) {
                    if (j + 1 < nums.length) {
                        if (nums[j] < nums[j + 1]) {
                            min = nums[j];
                            check++;
                            vi_tri = j;
                        } else {
                            min = nums[j + 1];
                            check++;
                            vi_tri = j+1;
                        }
                    } else {
                        min = nums[j];
                        vi_tri = j;
                        check++;
                    }
                } else {
                    if (min > nums[j]) {
                        min = nums[j];
                        vi_tri = j;
                    }
                }
            }
            check = 0;
            if (nums[i] > min) {
                int tam = nums[i];
                nums[i] = min;
                nums[vi_tri] = tam;
            }
        }
        return nums;
    }
}
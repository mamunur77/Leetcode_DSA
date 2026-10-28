class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        // int left =0;
        // int right = nums.length;
        int i =0;
        int res =0;
        // for(int j =1; j< nums.length; j++){
        //     if(nums[i] < nums[j] && nums[j]-nums[i] == 1){
        //         i++;
                
        //     }else{
        //         res = nums[j] - 1;
        //     }
            
        // }
        
        // return res;


        for(int j =0; j< nums.length; j++){
            if(nums[j]!= j){
                return j;
            }
            
        }
        return nums.length;

    }
}
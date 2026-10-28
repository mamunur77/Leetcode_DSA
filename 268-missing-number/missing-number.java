class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        int res =0;
        for(int j =1; j< nums.length; j++){
            if( nums[j]-nums[i] == 1){
                i++;
                
            }else{
                return nums[j] - 1;
            }
            
        }

        if(nums[0] !=0){
            return 0;
        }
        
        return nums.length;


        // for(int j =0; j< nums.length; j++){
        //     if(nums[j]!= j){
        //         return j;
        //     }
            
        // }
        // return nums.length;

    }
}
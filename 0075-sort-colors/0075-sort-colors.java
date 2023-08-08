class Solution {
    public void sortColors(int[] nums) {
       int countR=0;
       int countW=0;
        int countB=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                countR++;
            }
            else if(nums[i]==1){
                countW++;
            }
            else if(nums[i]==2)
                countB++;
        }

        for(int i = 0; i<nums.length; i++){
            if (i<countR){
                nums[i]=0;
            }
            else if(i<countR+countW){
                nums[i]=1;
            }
            else
                nums[i]=2;
        }
    }
}
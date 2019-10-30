//Problem: Remove Duplicates from an array

//Analysis: Take two pointer i and j and compare values get duplicate values.


public class RemoveDuplicates {

    public int removeDuplicates(int[] nums){

        int j=1;
        for(int i=0; i< arr.length; i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
}
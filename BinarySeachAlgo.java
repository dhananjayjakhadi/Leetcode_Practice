//Problem: Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. 
//If target exists, then return its index, otherwise return -1.


//Analysis: Binary search algorithm. Find mid compare less than mid and greater than mid element to 
//find target woth complexity O(log n)

public class BinarySeachAlgo {

    public int search(int[] nums, int target){

        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target)
                return mid;
            
            if(nums[mid] < target)
                low = mid + 1;
             else 
                high = mid - 1;
        }
        return -1;
    }
}
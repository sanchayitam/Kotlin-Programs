class Solution {
    fun search(nums: IntArray, target: Int): Int {
        
        if(nums.size == 0) return -1
        
        var low = 0
        var high = nums.size -1
       
        
        while(low <= high) {
        var mid =  (low  + high) / 2
            
            if(nums[mid] == target) return mid;
            
            
            else if (nums[mid] > target) {
                high = mid-1
            }
            else
            {
                low = mid+1
            }

        }
        return -1
    }
}

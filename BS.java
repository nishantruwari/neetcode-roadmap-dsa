
class Solution {
    public int search(int[] nums, int target) {
        int ans=-1;
        int ul=nums.length-1;
        int ll=0;
        
        while(ll<=ul){
            int mid=(ul+ll)/2;
            if(target==nums[mid]){
                return mid;
            }else{
                if(nums[mid]<target){
                    ll=mid+1;
                }else{
                    ul=mid-1;
                }
            }
        }
        return ans;
    }
}
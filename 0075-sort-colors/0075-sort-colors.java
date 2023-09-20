class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else {
                mid++;
            }
        } 
    }
    public static void swap(int[] a,int start,int end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
    
}
  
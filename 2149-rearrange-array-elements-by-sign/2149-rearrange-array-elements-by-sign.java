class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                arr2[j]=nums[i];
                j++;
            }
            else
            {
                arr1[k]=nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                nums[i]=arr1[j];
                j++;
            }
            else
            {
                nums[i]=arr2[k];
                k++;
            }
        }
        return nums;
    }
}
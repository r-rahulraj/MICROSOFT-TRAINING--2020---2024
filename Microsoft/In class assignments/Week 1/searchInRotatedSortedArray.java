class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1) {
            if(nums[0]==target) return 0;
            else return -1;
        }
        
        int pivot=findPivot(nums);
        
        if(pivot==-1) return binarySearch(nums,target,0,nums.length-1);
        if(nums[pivot]==target) return pivot;
        if(nums[0]>target) return binarySearch(nums,target,pivot+1,nums.length-1);
        return binarySearch(nums,target,0,pivot-1);
        
    }
    
    public int binarySearch(int[] arr,int target,int s,int e) {
        while(s<=e) {
            int m=s+(e-s)/2;
            if(arr[m]<target) s=m+1;
            else if(arr[m]>target) e=m-1;
            else return m;
         }
        return -1;
    }
    
    public int findPivot(int[] arr) {
        int s=0;
        int e=arr.length-1;
        
        while(s<=e) {
            int m=s+(e-s)/2;
            if(m>s && arr[m]<arr[m-1]) return m;
            else if(m<e && arr[m]>arr[m+1]) return m;
            else if(arr[s]<arr[m]) s=m+1;
            else e=m-1;
        }
        return -1;
    }
}

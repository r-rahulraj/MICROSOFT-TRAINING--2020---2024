class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums[nums.length-1];
        int index=1,k=1;
        int ele=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==l){
                if(nums[0]==l) return 1;
                swap(nums,i,index);
                return k+1;
            }
            if(nums[i]!=ele){
                ele=nums[i];
                swap(nums,i,index);
                k++;
                index+=1;
            }
        }
        return k;
    }
    public void swap(int[] arr,int i,int index) {
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=0;
        int x=nums1.length+nums2.length;
        int[] arr=new int[x];
        int midIndex=0;
        if(x%2==0) midIndex=(x/2)-1;
        else midIndex=x/2;
        int i=0,j=0;
        while(i!=nums1.length && j!=nums2.length) {
            if(nums1[i]<nums2[j]) {
                arr[k++]=nums1[i];
                i++;
            }
            else {
                arr[k++]=nums2[j];
                j++;
            }
        }
        while(i!=nums1.length) {
            arr[k++]=nums1[i];
            i++;
        }
        while(j!=nums2.length) {
            arr[k++]=nums2[j];
            j++;
        }
        if(x%2==0) return(double)(arr[arr.length/2-1]+arr[arr.length/2])/2.0;
        return (double)arr[arr.length/2];
    }
}

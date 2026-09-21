//MedianOfTwoSortedArrays-->

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int ans[] = new int[n + m];

        for (int i = 0; i < n; i++) {
            ans[i] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            ans[n+i] = nums2[i];
        }

        Arrays.sort(ans);

        int a = ans.length;
        int mid = a / 2;
        if(ans.length % 2 == 0)  return (ans[mid] + ans[mid - 1]) / 2.0;
        else  return ans[mid];
    }
}

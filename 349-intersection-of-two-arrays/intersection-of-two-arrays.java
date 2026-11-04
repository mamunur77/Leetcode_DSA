class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l =nums1.length;
        int r =nums2.length;
        int arr[] = new int[Math.min(l, r)];

        int k =0;

        for(int i =0;i<l;i++){
            for(int j =0; j<r;j++){
                if(nums1[i]==nums2[j]){
                boolean found = false;

                for (int x = 0; x < k; x++) {
                    if (arr[x] == nums1[i]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                        arr[k] = nums1[i];
                        k++;
                }

                break;
                }
            }
        }
        return Arrays.copyOf(arr, k);

    }
}
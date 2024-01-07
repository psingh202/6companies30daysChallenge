class Solution {
    public void wiggleSort(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);

        Arrays.sort(arr);
        int n = nums.length - 1;

        for (int i = 1; i < nums.length; i += 2) {
            nums[i] = arr[n--];
        }

        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = arr[n--];
        }
    }
}
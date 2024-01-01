class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int n = queries.length, k = 0;

        int[] ans = new int[n];

        Map<Integer, String[][]> map = new HashMap<>();

        for (int[] q : queries) {
            int j = q[0] - 1;
            int trim = q[1];
            if (!map.containsKey(trim)) {
                String[][] arr = new String[nums.length][2];
                int i = 0;
                for (String num : nums) {
                    arr[i] = new String[]{num.substring(num.length() - trim), "" + i++};
                }
                Arrays.sort(arr, Comparator.comparing(a -> a[0]));
                map.put(trim, arr);
            }
            ans[k++] = Integer.parseInt(map.get(trim)[j][1]);
        }
        return ans;
    }
}
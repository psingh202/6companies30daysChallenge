class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(ans, new ArrayList<Integer>(), k, 1, n);
        return ans;
    }

    public void comb(List<List<Integer>> ans, List<Integer> list, int k, int st, int n) {
        if (list.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(list);
            ans.add(li);
            return;
        }

        for (int i = st; i <= 9; i++) {
            list.add(i);
            comb(ans, list, k, i + 1, n - i);
            list.remove(list.size() - 1);
        }
    }
}
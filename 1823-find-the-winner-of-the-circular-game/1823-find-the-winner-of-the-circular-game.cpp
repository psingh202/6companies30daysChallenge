class Solution {
public:
    int findTheWinner(int n, int k) {
        queue<int> q;
        for (int i = 1; i <= n; i++) q.push(i);

        while (q.size() != 1) {
            int l = k - 1;
            while (l--) {
                int j = q.front();
                q.pop();
                q.push(j);
            }
            q.pop();
        }
        return q.front();
    }
};
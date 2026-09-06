class Solution {
    int t[][] = new int[101][101];
    int solve(int i, int j, int m, int n) {
        if (i >= m || j >= n)
            return 0;
        if (i == m - 1 && j == n - 1)
            return 1;
        if (t[i][j] != -1)
            return t[i][j];
        int r = solve(i, j + 1, m, n);
        int d = solve(i + 1, j, m, n);
        return t[i][j] = r + d;
    }
    public int uniquePaths(int m, int n) {
        for (int[] row : t)
            Arrays.fill(row, -1);
        return solve(0, 0, m, n);
    }
}
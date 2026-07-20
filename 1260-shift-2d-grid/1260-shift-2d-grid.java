class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k = k % total;

        int[][] ans = new int[m][n];

        for (int i = 0; i < total; i++) {
            // Original position
            int row = i / n;
            int col = i % n;

            // New position after shifting
            int newIndex = (i + k) % total;
            int newRow = newIndex / n;
            int newCol = newIndex % n;

            ans[newRow][newCol] = grid[row][col];
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(ans[i][j]);
            }
            result.add(list);
        }

        return result;
    }
}
class Solution {
    public int trapRainWater(int[][] heightMap) {
       int m = heightMap.length, n = heightMap[0].length;
        if (m < 3 || n < 3) return 0;

        boolean[][] visited = new boolean[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        // Add all border cells to the heap
        for (int i = 0; i < m; i++) {
            pq.offer(new int[]{i, 0, heightMap[i][0]});
            pq.offer(new int[]{i, n - 1, heightMap[i][n - 1]});
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }
        for (int j = 1; j < n - 1; j++) {
            pq.offer(new int[]{0, j, heightMap[0][j]});
            pq.offer(new int[]{m - 1, j, heightMap[m - 1][j]});
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }

        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int res = 0;

        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            for (int[] d : dirs) {
                int x = cell[0] + d[0], y = cell[1] + d[1];
                if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) continue;
                res += Math.max(0, cell[2] - heightMap[x][y]);
                pq.offer(new int[]{x, y, Math.max(heightMap[x][y], cell[2])});
                visited[x][y] = true;
            }
        }
        return res;
    }
}
        
   
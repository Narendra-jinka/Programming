class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r = mat.length, c = mat[0].length, count = 0;
        List<int[]> rowList = new ArrayList<>();
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            rowList.add(new int[]{i, count});
            count = 0;
        }
        Collections.sort(rowList, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowList.get(i)[0];
        }
        
        return result;
    }
}

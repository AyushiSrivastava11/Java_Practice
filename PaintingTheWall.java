class Solution {
	public static int paintWalls(int[] cost, int[] time) {
		int n = cost.length;
		int[] minMoney = new int[n + 1];
		Arrays.fill(minMoney, 1, n + 1, Integer.MAX_VALUE - (int) 1e6);
		for (int i = 0; i < n; i++) {
			int c = cost[i];
			int t = time[i] + 1;
			int j = n;
			for (; j > t; j--)
				minMoney[j] = Math.min(minMoney[j], c + minMoney[j - t]);
			for (; j > 0; j--)
				minMoney[j] = Math.min(minMoney[j], c);
		}
		return minMoney[n];
	}
}

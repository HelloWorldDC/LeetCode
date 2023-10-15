class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth=0;
        int sum_money=0;
        for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[0].length; j++) {
				sum_money+=accounts[i][j];
			}
			if(sum_money>max_wealth) {
				max_wealth=sum_money;
			}
			sum_money=0;
		}
		return max_wealth;
    }
}
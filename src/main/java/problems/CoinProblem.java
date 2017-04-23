package problems;

public class CoinProblem {

    private static final int INVALID = Integer.MAX_VALUE - 1;

    int minimumNumberOfCoinsNeeded(int sum, int[] coins) {
        if (sum < 0) {
            return -1;
        }
        int[] d = new int[sum + 1];
        for (int k = 0; k < sum + 1; k++) {
            d[k] = INVALID;
        }
        d[0] = 0;
        for (int coin : coins) {
            for (int j = coin; j <= sum; j++) {
                if (d[j] > d[j - coin]) {
                    d[j] = d[j - coin] + 1;
                }
            }
        }
        return d[sum] == INVALID ? -1 : d[sum];
    }
}

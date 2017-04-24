package problems;

class CoinProblem {

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

    /*
    Question: Find the number of ways sum can be formed with given denominations of coins. Assuming infinite supply of coins.

    assumption is all the intervals of length coin will have same values;
    eg coin =2
    0 1 2 3 4 5 6
    1 0 1 0 1 0 1
    |___|
      |___|
    eg coin 6
    0 1 2 3 4 5 6 7 8 9 10 11 12
    1 0 0 0 0 0 1 0 0 0 0  0  1
    |___________|
      |___________|
     */
    int count(int sum, int[] coins) {
        if (sum < 0) {
            return 0;
        }
        int[] d = new int[sum + 1];
        d[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= sum; j++) {
                //ways of forming j = all previous ways of forming j with other coins (old value of d[i])
                //                    + value of the previous interval of width 'coin'
                d[j] = d[j] + d[j - coin];
            }
        }
        return d[sum];
    }
}

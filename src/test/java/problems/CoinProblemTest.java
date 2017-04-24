package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinProblemTest {
    CoinProblem problem = new CoinProblem();

    @Test
    public void shouldGetMinNumberOfCoinsToGetTheAmount() {
        int[] coins = {1, 2, 5};
        int sum = 11;
        assertEquals(3, problem.minimumNumberOfCoinsNeeded(sum, coins));
    }

    @Test
    public void shouldGetMinusOneForNegativeSumOrEmptyCoins() {
        int[] coins = {1, 2, 5};
        int[] noCoins = {};
        assertEquals(-1, problem.minimumNumberOfCoinsNeeded(-1, coins));
        assertEquals(-1, problem.minimumNumberOfCoinsNeeded(5, noCoins));
    }

    @Test
    public void shouldGetZeroForZeroSum() {
        int[] coins = {1, 2, 5};
        assertEquals(0, problem.minimumNumberOfCoinsNeeded(0, coins));
    }

    @Test
    public void shouldGetMinusOneIfNotPossible() {
        int[] coins = {2, 6};
        int sum = 7;
        assertEquals(-1, problem.minimumNumberOfCoinsNeeded(sum, coins));
    }

    @Test
    public void shouldGetNumberOfWaysTheAmountCanBeMade() {
        int[] coins = {1, 2, 3};
        int sum = 5;
        assertEquals(5, problem.count(sum, coins));

    }

    @Test
    public void shouldGetZeroIfNoWay() {
        int[] coins = {2, 6};
        int sum = 7;
        assertEquals(0, problem.count(sum, coins));
    }

    @Test
    public void shouldGetZeroForNoCoinsAndNegativeSum() {
        int[] coins = {2, 6};
        int[] noCoins = {};
        assertEquals(0, problem.count(-1, coins));
        assertEquals(0, problem.count(7, noCoins));
    }

    @Test
    public void shouldGetOne_ThatIsWithoutTakingAnyCoin_ForZeroSum() {
        int[] coins = {2, 6};
        assertEquals(1, problem.count(0, coins));
    }
}
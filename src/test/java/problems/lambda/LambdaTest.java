package problems.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class LambdaTest {

    private final Lambda lambda = new Lambda();

    @Test
    public void shouldZeroIfNoCountry() {
        assertEquals(0, lambda.getTotalPopulation(Collections.emptyList(), "Asia"));
        assertEquals(0, lambda.getTotalPopulation(null, "Asia"));
    }

    @Test
    public void shouldReturnZeroIfNoContinent() {
        List<Country> countryList = new ArrayList<>();
        assertEquals(0, lambda.getTotalPopulation(countryList, ""));
        assertEquals(0, lambda.getTotalPopulation(countryList, null));
    }

    @Test
    public void shouldReturnSumOfPopulationsInAContinent() {
        List<Country> countries = getCountries("Asia");
        assertEquals(6, lambda.getTotalPopulation(countries, "Asia"));
    }

    @Test
    public void shouldNotIncludePopulationFromOtherContinents() {
        List<Country> countries = new ArrayList<>();
        countries.addAll(getCountries("Asia"));
        countries.addAll(getCountries("Africa"));
        assertEquals(6, lambda.getTotalPopulation(countries, "Asia"));
    }

    private List<Country> getCountries(String continent) {
        return asList(
                new Country(continent, 1),
                new Country(continent, 1),
                new Country(continent, 1),
                new Country(continent, 1),
                new Country(continent, 1),
                new Country(continent, 1)
        );
    }
}

package problems.lambda;

import java.util.List;

public class Lambda {
    public int getTotalPopulation(List<Country> countries, String continent) {
        if (countries != null
                && !countries.isEmpty()
                && continent != null
                && !continent.isEmpty()) {

            return countries.stream()
                    .mapToInt(country -> continent.equals(country.getContinent()) ? country.getPopulation() : 0)
                    .sum();
        }
        return 0;
    }
}

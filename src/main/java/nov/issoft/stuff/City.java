package nov.issoft.stuff;

import java.util.Map;

public enum City {
    BREST(CityDistancesProvider.provideBrestDistances()),
    GOMEL(CityDistancesProvider.provideGomelDistances()),
    GRODNO(CityDistancesProvider.provideGrodnoDistances()),
    MINSK(CityDistancesProvider.provideMinskDistances()),
    VITEBSK(CityDistancesProvider.provideVitebskDistances());

    private Map<City, Integer> distances;

    City(Map<City, Integer> distances) {
        this.distances = distances;
    }

    public int getDistance(City city) {
        return distances.get(city);
    }
}

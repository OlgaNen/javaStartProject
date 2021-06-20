package nov.issoft.stuff;

import java.util.HashMap;
import java.util.Map;

public class CityDistancesProvider {

    public static Map<City, Integer> provideMinskDistances() {
        Map<City, Integer> distances = new HashMap<>();
        distances.put(City.VITEBSK, 100);
        distances.put(City.BREST, 50);
        distances.put(City.GOMEL, 70);
        distances.put(City.GRODNO, 80);
        return distances;
    }

    public static Map<City, Integer> provideVitebskDistances() {
        Map<City, Integer> distances = new HashMap<>();
        distances.put(City.MINSK, 100);
        distances.put(City.BREST, 65);
        distances.put(City.GOMEL, 85);
        distances.put(City.GRODNO, 105);
        return distances;
    }

    public static Map<City, Integer> provideBrestDistances() {
        Map<City, Integer> distances = new HashMap<>();
        distances.put(City.MINSK, 50);
        distances.put(City.VITEBSK, 65);
        distances.put(City.GOMEL, 65);
        distances.put(City.GRODNO, 70);
        return distances;
    }

    public static Map<City, Integer> provideGomelDistances() {
        Map<City, Integer> distances = new HashMap<>();
        distances.put(City.MINSK, 70);
        distances.put(City.VITEBSK, 150);
        distances.put(City.BREST, 100);
        distances.put(City.GRODNO, 65);
        return distances;
    }

    public static Map<City, Integer> provideGrodnoDistances() {
        Map<City, Integer> distances = new HashMap<>();
        distances.put(City.MINSK, 80);
        distances.put(City.VITEBSK, 105);
        distances.put(City.BREST, 70);
        distances.put(City.GOMEL, 65);
        return distances;
    }
}

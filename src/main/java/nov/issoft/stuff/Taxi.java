package nov.issoft.stuff;

import java.util.List;

public class Taxi {

    private int currentFuelResource;
    private City currentCity;

    public boolean orderToCity(List<City> cities) {
        int distance = 0;
        City lastCity = null;
        for (City city : cities){
            if (lastCity == null) {
                lastCity = city;
                continue;
            }
            distance += lastCity.getDistance(city);
            lastCity = city;
        }

        if (distance > currentFuelResource) {
            return false;
        }


        currentCity = cities.get(cities.size() - 1);
        return true;
    }

    public boolean isEnoughFuel(City city) {
        return currentFuelResource >= currentCity.getDistance(city);
    }

    public int getCurrentFuelResource() {
        return currentFuelResource;
    }

    /*public static void main (String[] args) {
        System.out.println("MINSK", "VITEBSK");
        if (??) {
            System.out.println("Не еду!" + "currentFuelResource");
        } else{
            System.out.println("Eду!" + "currentFuelResource");
        }

    }*/

}

package nov.issoft.street;

import java.util.List;

public class Street {
    private List<House> houses;

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public double calculateCost() {
        double result = 0;
        for(House house : houses){
            result += house.calculateCost();
        }
        return result;
    }
}

package nov.issoft.street;

import java.util.List;

public class Townhouse implements House {

    private List<Flat> flats;

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public double calculateCost() {
        double result = 0;
        for(Flat flat : flats) {
            result += 0.7 * flat.calculateCost();
        }
        return result;
    }
}

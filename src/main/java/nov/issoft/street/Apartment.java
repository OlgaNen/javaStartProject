package nov.issoft.street;

import java.util.List;

public class Apartment implements House {

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
            result += 0.5 * flat.calculateCost();
        }
        return result;
    }
}

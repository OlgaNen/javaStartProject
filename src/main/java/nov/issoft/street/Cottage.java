package nov.issoft.street;

public class Cottage implements House {
    private Flat flat;

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    @Override
    public double calculateCost() {
        return flat.calculateCost() * 0.9;
    }
}

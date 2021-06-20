package nov.issoft.street;

public class Flat {
    private int square;
    private int people;
    private int animals;

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getAnimals() {
        return animals;
    }

    public void setAnimals(int animals) {
        this.animals = animals;
    }

    public double calculateCost() {
        return square * (people + animals);
    }
}

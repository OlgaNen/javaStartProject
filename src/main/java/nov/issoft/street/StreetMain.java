package nov.issoft.street;

import java.util.Arrays;
import java.util.List;

public class StreetMain {
    public static void main(String[] args) {
        Flat flat1 = new Flat();
        flat1.setAnimals(5);
        flat1.setPeople(3);
        flat1.setSquare(150);

        Flat flat2 = new Flat();
        flat2.setAnimals(1);
        flat2.setPeople(4);
        flat2.setSquare(170);

        Flat flat3 = new Flat();
        flat3.setAnimals(0);
        flat3.setPeople(5);
        flat3.setSquare(200);

        Flat flat4 = new Flat();
        flat4.setAnimals(1);
        flat4.setPeople(2);
        flat4.setSquare(60);

        Flat flat5 = new Flat();
        flat5.setAnimals(2);
        flat5.setPeople(3);
        flat5.setSquare(80);

        Flat flat6 = new Flat();
        flat6.setAnimals(1);
        flat6.setPeople(1);
        flat6.setSquare(80);

        Flat flat7 = new Flat();
        flat7.setAnimals(0);
        flat7.setPeople(1);
        flat7.setSquare(70);

        Flat flat8 = new Flat();
        flat8.setAnimals(2);
        flat8.setPeople(4);
        flat8.setSquare(150);

        Flat flat9 = new Flat();
        flat9.setAnimals(3);
        flat9.setPeople(4);
        flat9.setSquare(160);
        Cottage cottage1 = new Cottage();
        cottage1.setFlat(flat9);

        Flat flat10 = new Flat();
        flat10.setAnimals(2);
        flat10.setPeople(6);
        flat10.setSquare(260);
        Cottage cottage2 = new Cottage();
        cottage2.setFlat(flat10);

        List<Flat> flats1 = Arrays.asList(flat1, flat2, flat3, flat6, flat7, flat8);
        Apartment apartment1 = new Apartment();
        apartment1.setFlats(flats1);

        List<Flat> flats2 = Arrays.asList(flat4, flat5);
        Townhouse townhouse = new Townhouse();
        townhouse.setFlats(flats2);

        Street street = new Street();
        List<House> houses = Arrays.asList(apartment1, townhouse, cottage1, cottage2);
        street.setHouses(houses);
        System.out.println(street.calculateCost());

    }
}

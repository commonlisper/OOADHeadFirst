package chapter01;

import java.util.List;
import java.util.ArrayList;

import chapter01.domain.Guitar;
import chapter01.domain.Type;
import chapter01.domain.Builder;
import chapter01.domain.Wood;
import chapter01.domain.GuitarSpec;

public class Inventory {
    private final List<Guitar> guitars = new ArrayList<>();

    public void AddGuitar(String serialNumber, double price,
                          Builder builder, String model, Type type, int numStrings,
                          Wood backWood, Wood topWood) {
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar GetGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
                return guitar;
            }
        }

        return null;
    }

    public List<Guitar> Search(GuitarSpec searchedSpec) {
        List<Guitar> searchedGuitars = new ArrayList<>();

        for (Guitar guitar : guitars) {
            GuitarSpec guitarSpec = guitar.getSpec();

            if (guitarSpec.equals(searchedSpec))
                searchedGuitars.add(guitar);
        }

        return searchedGuitars;
    }
}
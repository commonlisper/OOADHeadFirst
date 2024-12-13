package chapter01.tests;

import chapter01.Inventory;
import chapter01.domain.*;

import java.util.List;

public class FindGuitarTester {
    private final Inventory inventory;

    public FindGuitarTester() {
        inventory = new Inventory();
        InitializeInventory(inventory);
    }

    public void WhatErinLikesTest() {
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.Fender, "Stratocastor", Type.Electric, 6, Wood.Alder, Wood.Alder);
        List<Guitar> searchedGuitars = inventory.search(whatErinLikes);

        if (searchedGuitars.isEmpty()) {
            System.out.println("Sorry, Erin, we have nothing for you");
            return;
        }

        System.out.println("Erin, you might like these guitars:");
        for (Guitar guitar : searchedGuitars) {
            System.out.println("\tWe have a " + guitar.getSpec().getBuilder() +
                    " " + guitar.getSpec().getModel() +
                    " " + guitar.getSpec().getType() + " guitar:");
            System.out.println("\tWith " + guitar.getSpec().getNumStrings() + " strings,");
            System.out.println("\t" + guitar.getSpec().getBackWood() + " back and sides,");
            System.out.println("\t" + guitar.getSpec().getTopWood() + " top.");
            System.out.println("\tYou can have it for only $" + guitar.getPrice() + "!");
            System.out.println("\t----------");
        }
    }

    private static void InitializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693",
                1499.95, Builder.Fender, "Stratocastor",
                Type.Electric, 6, Wood.Alder, Wood.Alder);

        inventory.addGuitar("V9512",
                1549.95, Builder.Fender, "Stratocastor",
                Type.Electric, 6, Wood.Alder, Wood.Alder);
    }
}

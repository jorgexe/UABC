package tarea11;

import java.util.*;
import java.util.stream.*;

public class CoffeeOrder {
    public static void main(String[] args) {
        List<String> coffees = List.of("Capuccino", "Americano", "Espresso", "Cortado", "Mocha", "Capuccino", "Flat WHite", "Latte");
        
        List<String> coffeesEndingInO = coffees.stream()
            .distinct()
            .sorted()
            .filter(coffee -> coffee.endsWith("o"))
            .collect(Collectors.toList());

        System.out.println(coffeesEndingInO);
    }
}
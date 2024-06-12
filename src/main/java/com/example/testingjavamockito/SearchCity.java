package com.example.testingjavamockito;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchCity {
    private List<String> cities;

    public List<String> searchCity(String city) {
        cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("Budapest");
        cities.add("Skopje");
        cities.add("Rotterdam");
        cities.add("Valence");
        cities.add("Vancouver");
        cities.add("Amsterdam");
        cities.add("Vienne");
        cities.add("Sydney");
        cities.add("New York");
        cities.add("Londres");
        cities.add("Bangkok");
        cities.add("Hong Kong");
        cities.add("Dubaï");
        cities.add("Rome");
        cities.add("Istanbul");

        if (city.length() < 2) {
            throw new NotFoundException("City not found, please try again with at least 2 characters minimum");
        }

        return cities.stream()
                .filter(c -> c.toLowerCase().startsWith(city.toLowerCase()))
                .collect(Collectors.toList());
    }
}

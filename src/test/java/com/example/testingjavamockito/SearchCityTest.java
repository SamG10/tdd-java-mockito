package com.example.testingjavamockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SearchCityTest {

    private SearchCity searchCity;

    @Test
    public void searchCity() {
        // Arrange
        searchCity = new SearchCity();

        // Act
        Exception exception = assertThrows(NotFoundException.class, () -> {
            searchCity.searchCity("t");
        });

        String expectedMessage = "City not found, please try again with at least 2 characters minimum";
        String result = exception.getMessage();

        // Assert
        assertTrue(result.contains(expectedMessage));
    }

    @Test
    public void searchCityWith2Characters() {
        // Arrange
        searchCity = new SearchCity();

        // Act
        List<String> result = searchCity.searchCity("Va");

        // Assert
        assertEquals(2, result.size());
        assertTrue(result.contains("Valence"));
        assertTrue(result.contains("Vancouver"));
    }

    @Test
    public void searchCityWithContainCharactersInTheCity() {
        // Arrange
        searchCity = new SearchCity();

        // Act
        List<String> result = searchCity.searchCity("ape");

        // Assert
        assertEquals(1, result.size());
        assertTrue(result.contains("Budapest"));
    }
}

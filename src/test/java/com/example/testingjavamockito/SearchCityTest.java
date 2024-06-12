package com.example.testingjavamockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}

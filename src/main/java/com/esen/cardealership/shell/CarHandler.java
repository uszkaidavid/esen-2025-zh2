package com.esen.cardealership.shell;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * Az alkalmazásunk öt funkcionalitással rendelkezik:
 * •	list cars – autók listázása (szeretném látni az autó összes tulajdonságát)
 * •	add car – autó hozzáadása
 * •	sell car – autó eladása
 * •	updateCarPrice – autó árának frissítése
 * •	searchForCar – keresés az adatbázisban brand, model, color ÉS/VAGY fuelType alapján, felhasználói preferencia szerint szabadon(szeretném látni az autó összes tulajdonságát)
 * Egészítsd ki a hiányzó annotációkkal/kódrészletekkel a projektet!
 */
public class CarHandler {

    @ShellMethod(value = "List cars", key = "list cars")
    public String listCars() {
        return null;
    }

    @ShellMethod(value = "Add a car", key = "add car")
    public void addCar(String brand, String model, Integer releaseYear, Integer power, String color, String fuelType, Integer price) {
    }

    @ShellMethod(value = "Sell a car", key = "sell car")
    public void sellCar(Long id) {

    }

    @ShellMethod(value = "Update car price", key = "update car price")
    public void updateCarPrice(Long id, Integer price) {

    }

    @ShellMethod(value = "Search for cars", key = "search cars")
    public String searchForCar(@ShellOption(defaultValue = ShellOption.NULL) String brand,
                               @ShellOption(defaultValue = ShellOption.NULL) String model,
                               @ShellOption(defaultValue = ShellOption.NULL) String color,
                               @ShellOption(defaultValue = ShellOption.NULL) String fuelType) {
        return null;
    }
}

package repeat;

import java.util.HashMap;
import java.util.Map;

public class RepeatHashMap {
    public static void main(String[] args) {
        hashMapExample();
    }
    private static void hashMapExample() {
        Map<String, String> countriesAndCapitals = new HashMap<>();

        // dodanie elementów -----------------------

        countriesAndCapitals.put("Poland", "Warsaw");
        countriesAndCapitals.put("France", "Paris");
        countriesAndCapitals.put("Germany", "Berlin");
        countriesAndCapitals.put("Russia", "Moscow");
        countriesAndCapitals.put("USA", "Washington DC");

        // pobranie elementu ----- należy podać klucz elementu
        System.out.println(countriesAndCapitals.get("Poland"));

        // dodanie elementu pod ten sam klucz spowoduje nadpisanie wcześniejszej wartości
        // metoda putIfAbsent doda wartosc do klucza w przypadku gdy nie ma on wartości
        countriesAndCapitals.putIfAbsent("Poland", "Cracow");
        System.out.println(countriesAndCapitals.get("Poland"));

        // próba pobrania nieistniejącego klucza
        System.out.println(countriesAndCapitals.get("Italy")); // dostaniemy null
        // metoda getOrDefault zwróci nam wartość domyslną zdefiniowaną przez nas
        System.out.println(countriesAndCapitals.getOrDefault("Italy", "Capital for this country was not defined."));

        // sprawdzenie czy w liście znajduje się klucz lub wartość
        System.out.println(countriesAndCapitals.containsKey("Italy"));
        System.out.println(countriesAndCapitals.containsValue("Rome"));

        //wyświetlenie wszystkich kluczy oraz wartości w mapie
        countriesAndCapitals.keySet().forEach(System.out::println); // klucze
        System.out.println("-------------");
        countriesAndCapitals.values().forEach(System.out::println); // wartości

        // nadpisanie wartości pod danym kluczem
        countriesAndCapitals.replace("Poland", "Crecow");

        // dodanie do hashmapy innej hashmapy w całości
        Map<String, String> asianCountriesAndCapitals = new HashMap<>(); // nowa hashMapa
        asianCountriesAndCapitals.put("Thailand", "Bangkok");
        asianCountriesAndCapitals.put("Indonesia", "Jakarta");
        // dodanie tej hashMapy do istniejącej
        countriesAndCapitals.putAll(asianCountriesAndCapitals);
        // wyswietlenie kluczy hashMapy po połączeniu
        countriesAndCapitals.keySet().forEach(System.out::println);

        // sprawdzenie czy hashMapa jest pusta oraz jej rozmiar
        System.out.println(countriesAndCapitals.isEmpty());
        System.out.println(countriesAndCapitals.size());
        // wyczyszczenie hashMapy
        countriesAndCapitals.clear();
    }
}

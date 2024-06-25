import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2010));
        cars.add(new Car("Ford", 2005));
        cars.add(new Car("Honda", 2012));
        cars.add(new Car("BMW", 2015));
        cars.add(new Car("Audi", 2008));
        cars.add(new Car("Mercedes", 2011));
        cars.add(new Car("Kia", 2013));
        cars.add(new Car("Hyundai", 2009));
        cars.add(new Car("Volkswagen", 2007));
        cars.add(new Car("Mazda", 2014));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }

        // Zadanie 2
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Młotek"));
        items.add(new Item(2, "Śrubokręt"));
        items.add(new Item(3, "Klucz"));
        items.add(new Item(4, "Piła"));
        items.add(new Item(5, "Wkrętarka"));

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        Map<Integer, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.getId(), item.getNazwa());
        }

        for (Map.Entry<Integer, String> entry : itemsMap.entrySet()) {
            System.out.println("Identyfikator: " + entry.getKey() + ", Nazwa: " + entry.getValue());
        }

        // Zadanie 3
        List<Item> items2 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            items2.add(new Item(i, "Przedmiot " + i));
        }

        List<Item> subList = items2.subList(0, 5);
        Set<Item> itemsSet = new HashSet<>(subList);

        for (Item item : itemsSet) {
            System.out.println(item);
        }

        // Zadanie 4
        int[] array = new int[10];
        fillArray(array);

        for (int number : array) {
            System.out.println(number);
        }
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                array[i] = 0;
            }
        }
    }
}

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Test Multiplier class
        Multiplier multiplier = new Multiplier();
        System.out.println("Multiply 2 and 3: " + multiplier.multiply(2, 3));
        System.out.println("Multiply 1, 2, 3, and 4: " + multiplier.multiply(1, 2, 3, 4));
        System.out.println("Multiply 2.5 and 3.5: " + multiplier.multiply(2.5, 3.5));
        System.out.println("Multiply BigDecimal 2 and 3: " + multiplier.multiply(new BigDecimal("2"), new BigDecimal("3")));
        System.out.println("Multiply list of integers 2, 3, 4: " + multiplier.multiply(Arrays.asList(2, 3, 4)));

        // Test Adder class
        Adder adder = new Adder();
        System.out.println("Add 2 and 3: " + adder.add(2, 3));
        System.out.println("Add list of BigDecimal 2, 3, 4: " + adder.add(Arrays.asList(new BigDecimal("2"), new BigDecimal("3"), new BigDecimal("4"))));

        // Test Address class
        Address address = new Address();
        System.out.println(address.createAddress("Polska"));
        System.out.println(address.createAddress("Polska", "Warszawa"));
        System.out.println(address.createAddress("Polska", "Warszawa", "00-001"));
        System.out.println(address.createAddress("Polska", "Warszawa", "00-001", "Marszałkowska"));
        System.out.println(address.createAddress("Polska", "Warszawa", "00-001", "Marszałkowska", 10));
    }
}

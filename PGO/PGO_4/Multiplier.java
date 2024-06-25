import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c, int d) {
        return multiply(multiply(a, b), multiply(c, d));
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public int multiply(List<Integer> integers) {
        int result = 1;
        for (int integer : integers) {
            result *= integer;
        }
        return result;
    }
}

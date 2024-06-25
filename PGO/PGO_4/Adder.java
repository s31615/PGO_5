import java.math.BigDecimal;
import java.util.List;

public class Adder {

    public int add(int a, int b) {
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> bigDecimals) {
        BigDecimal result = BigDecimal.ZERO;
        for (BigDecimal bigDecimal : bigDecimals) {
            result = result.add(bigDecimal);
        }
        return result;
    }
}
